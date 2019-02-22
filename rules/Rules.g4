grammar Rules;

rulemodel : (NEWLINE* (modelrule) (NEWLINE | modelrule)*) EOF;

modelrule : (WHITESPACE | NEWLINE)+ rulez	
			(WHITESPACE | NEWLINE)+ valuetype
			(WHITESPACE | NEWLINE)+ when
			(WHITESPACE | NEWLINE)+ valuetype
			(WHITESPACE | NEWLINE)+ then
			(WHITESPACE | NEWLINE)+ valuetype
			(WHITESPACE | NEWLINE)+ end;
			
rulez : 'rule';
when : 'when';
then :	'then';
end : 'end';

valuetype:
    STRING | NUMBER | BOOLEAN
;

ML_COMMENT	: '/*' .*? '*/' -> channel(HIDDEN);

SL_COMMENT 	: WHITESPACE? '//' .*? (NEWLINE | EOF) -> channel(HIDDEN);

IDENTIFIER: '^'?('a'..'z'|'A'..'Z'|'_'|'0'..'9') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*;

BOOLEAN: 
    'true' | 'false'
;

NUMBER:
    IDENTIFIER ('.' IDENTIFIER )?
;

STRING	: 
			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\') | ~('\\'|'"') )* '"' |
			'\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\') | ~('\\'|'\'') )* '\''
		; 

NEWLINE
  : CR? LF
  ;

CR: '\r';
LF: '\n';

WHITESPACE: (' '|'\t'|'\f');

ANY_OTHER: .;