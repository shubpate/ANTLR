// Define a grammar called Hello
grammar Hello;
r  : 'hello' p ;         // match keyword hello followed by an identifier
p : ID 'bye';
rules : RULE;
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
RULE : 'rule' [a-z]+;