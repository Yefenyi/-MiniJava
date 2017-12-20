grammar Hello;

INT : '-'? [1-9][0-9]+ | [0-9];
DIGIT : [0-9];
UNDERSCORE : '_';
LETTER : [a-zA-Z];
ID : LETTER (LETTER| DIGIT| UNDERSCORE)*;
TYPE : 'int' '[' ']' | 'boolean' | 'int' | ID;
ADD_MINUS : '+' | '-';
bool : 'true' | 'false'| expr_cmp;
AND : '&&';
WS : [\t\r\n]+ -> skip ;

t : INT | '(' expr_am ')'| ID| expr_neg| '(' t ')';

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

array : ID '[' expr_arith  ']'
      | '(' array ')'
      ;

expr_length : ( array| ID) '.' 'length'
            | '(' expr_length')'
            ;

expr_this : 'this' 
          | '(' expr_this ')'
          ;

expr_new : 'new' 'int' '[' expr_arith ']' 
         | 'new' ID '(' ')'
         | '(' expr_new ')'
         ;

expr_unit : (expr_arith | array| expr_length| expr_this| expr_new);

expr_para : expr_unit '.' ID '(' (expr_unit (',' expr_unit)*)? ')'
          ;

expr: expr_unit | expr_para | '(' expr ')';

stat : '{' stat '}'
     | 'if' '(' expr ')' stat 'else' stat
     | 'while' '(' expr ')' stat
     | 'System.out.println' '(' expr ')' ';'
     | ID '=' expr ';'
     | ID '[' expr ']' '=' expr ';'
     ;
