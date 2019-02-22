grammar Openhab;

start: 	(NEWLINE* (SingleRule) (NEWLINE | SingleRule)*) EOF;

SingleRule : Rule RuleLiteral When NormalLiteral Then NormalLiteral+ End;

Rule : 'rule ';
When :'when';
Then : 'then';
End  : 'end';



fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;
	
fragment
OctalNumeral
	:	'0' Underscores? OctalDigits
	;


fragment
OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;

NormalLiteral
	:	StringCharacters?
	;

RuleLiteral
	:	'"' StringCharacters? '"'
	;

fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;

// §3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	|	OctalEscape
    |   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
	;

fragment
OctalEscape
	:	'\\' OctalDigit
	|	'\\' OctalDigit OctalDigit
	|	'\\' ZeroToThree OctalDigit OctalDigit
	;

fragment
ZeroToThree
	:	[0-3]
	;

// This is not in the spec but prevents having to preprocess the input
fragment
UnicodeEscape
    :   '\\' 'u'+  HexDigit HexDigit HexDigit HexDigit
    ;


WS  :  [ \t\r\n\u000C]+ -> skip
    ;
	
	
NEWLINE
  : CR? LF
  ;

CR: '\r';
LF: '\n';