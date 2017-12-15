grammar MiniJava;

//basic elements
ID : LETTER (LETTER | DIGIT)* ;
INT: [1-9] DIGIT* | DIGIT ;
FLOAT: INT '.' [0-9]* [1-9] ;

LETTER	: [a-zA-Z] ;
DIGIT	: [0-9] ;
OPR: '+' | '-' | '*' | '/' | '<' | '<=' | '>=' | '>' | '==' | '!=' | '&&' | '||' | '!';
DEL: ';' | '.' | ',' | '=' | '(' | ')' | '{' | '}' | '[' | ']';
WS : [\t\r\n]+ -> skip ;

stat: expr ';' ;// expression statement
expr: ID '(' ')' | INT ;
