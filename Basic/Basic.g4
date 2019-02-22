// Define a grammar called Hello
grammar Basic;
r  : 'hello' p;         // match keyword hello followed by an identifier
start : IMPORT | varDeclaration* r EOF;
//importDeclaration : IMPORT;
varDeclaration : VAR; 
p : ID 'bye';
rules : RULE;

ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
RULE : 'rule' [a-z]+;
IMPORT : 'import';
VAR : 'var';