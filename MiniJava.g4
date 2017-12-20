grammar MiniJava;
prog : 'hello'; // EXPRESSION*;
//basic elements
IDENTIFIER : LETTER (LETTER | DIGIT | UNDERSCORE)* ;
INTEGER_LITERAL : [1-9] DIGIT* | DIGIT ;
FLOAT : INTEGER_LITERAL '.' DIGIT* [1-9] ;
LETTER : [a-zA-Z] ;
DIGIT : [0-9] ;
UNDERSCORE : '_';

BINARY_OPR : '&&' | '<' | '+' | '-' | '*';
DEL : ';' | '.' | ',' | '=' | '(' | ')' | '{' | '}' | '[' | ']';
WS : [\t\r\n]+ -> skip ;

TYPE : 'int' '[' ']' | 'boolean' | 'int' | IDENTIFIER;


//Expression
/**
EXPRESSION : INTEGER_LITERAL
           | 'true'
           | 'false'
           | IDENTIFIER
           | 'this'
           | 'new' 'int' '[' EXPRESSION ']'
           | 'new' IDENTIFIER '(' ')'
           | '!' EXPRESSION
           | '(' EXPRESSION ')'
           | EXPRESSION BINARY_OPR EXPRESSION
           | EXPRESSION '[' EXPRESSION ']'
           | EXPRESSION '.' 'length'
           | EXPRESSION '.' IDENTIFIER '(' (EXPRESSION (',' EXPRESSION)* )? ')';

**/
//Statement
