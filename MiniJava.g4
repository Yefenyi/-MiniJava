grammar MiniJava;

INT : '-'? [1-9][0-9]+ | [0-9];
DIGIT : [0-9];
UNDERSCORE : '_';
LETTER : [a-zA-Z];
id : LETTER (LETTER| DIGIT| UNDERSCORE)*;
type : ( 'int' '[' ']') | 'boolean' | 'int'| id;
ADD_MINUS : '+' | '-';
bool : 'true' | 'false'| expr_cmp;
AND : '&&';
WS : [ \t\r\n]+ -> skip ;

t : INT | '(' expr_am ')'| id| expr_neg| '(' t ')';

expr_neg : '!'+ ( t| expr_and);

expr_cmp : t '>' t
         | '(' expr_cmp ')'
         ;

expr_am : expr_time  (ADD_MINUS expr_time )*
         | '(' expr_am ')'
         ;

expr_time : t ('*' t)*
          | '(' expr_time ')'
          ;

expr_and : bool (AND bool)*
         | '(' expr_and ')'
         ;

expr_arith : expr_am | expr_and;

array : id '[' expr_arith  ']'
      | '(' array ')'
      ;

expr_length : ( array| id) '.' 'length'
            | '(' expr_length')'
            ;

expr_this : 'this' 
          | '(' expr_this ')'
          ;

expr_new : 'new' 'int' '[' expr_arith ']' 
         | 'new' id '(' ')'
         | '(' expr_new ')'
         ;

expr_unit : (expr_arith | array| expr_length| expr_this| expr_new);

expr_para : expr_unit '.' id '(' (expr_unit (',' expr_unit)*)? ')'
          ;

expr: expr_unit | expr_para | '(' expr ')';

stat : '{' stat '}'
     | 'if' '(' expr ')' stat 'else' stat
     | 'while' '(' expr ')' stat
     | 'System.out.println' '(' expr ')' ';'
     | id '=' expr ';'
     | id '[' expr ']' '=' expr ';'
     ;

varDef : type id ';';

methodDef : 'public' type id '(' (type id (',' type id )*)? ')' '{' (varDef)* (stat)* 'return' expr ';' '}';

classDef : 'class' id ('extends' id)? '{' (varDef)* (methodDef)* '}';

mainClass : 'class' id ('extends' id)? '{' 'public' 'static' 'void' 'main' 
           '(' 'String' '[' ']' id ')' '{' stat '}' '}';

prog: mainClass (classDef)* ;
