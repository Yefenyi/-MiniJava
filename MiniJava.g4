grammar MiniJava;

INT : '-'? [1-9][0-9]+ | [0-9];
DIGIT : [0-9];
UNDERSCORE : '_';
LETTER : [a-zA-Z];
id : LETTER (LETTER| DIGIT| UNDERSCORE)*
   | (DIGIT| UNDERSCORE) (LETTER| DIGIT| UNDERSCORE)* {notifyErrorListeners("ID should start with a letter!");}
   ;
type : ( 'int' '[' ']') | 'boolean' | 'int'| id;
ADD_MINUS : '+' | '-';
bool : 'true' | 'false'| expr_cmp;
AND : '&&';
WS : [ \t\r\n]+ -> skip ;

t : INT | '(' expr_am ')'| id| expr_neg| '(' t ')';

expr_neg : '!'+ ( t| expr_and);

expr_cmp : t '>' t
         | '(' expr_cmp ')'
         | '(' expr_cmp {notifyErrorListeners("Missing closing ')'");}
         ;

expr_am : expr_time  (ADD_MINUS expr_time )*
         | '(' expr_am ')'
         | '(' expr_am {notifyErrorListeners("Missing closing ')'");}
         ;

expr_time : t ('*' t)*
          | '(' expr_time ')'
          | '(' expr_time {notifyErrorListeners("Missing closing ')'");}
          ;

expr_and : bool (AND bool)*
         | '(' expr_and ')'
         | '(' expr_and {notifyErrorListeners("Missing closing ')'");}
         ;

expr_arith : expr_am | expr_and;

array : id '[' expr_arith  ']'
      | id '[' expr_arith {notifyErrorListeners("Missing closing ']'");}
      | '(' array ')'
      | '(' array {notifyErrorListeners("Missing closing ')'");}
      ;

expr_length : ( array| id) '.' 'length'
            | '(' expr_length')'
            | '(' expr_length {notifyErrorListeners("Missing closing ')'");}
            ;

expr_this : 'this' 
          | '(' expr_this ')'
          | '(' expr_this {notifyErrorListeners("Missing closing ')'");}
          ;

expr_new : 'new' type '[' expr_arith ']'
         | 'new' type '[' expr_arith ']' {notifyErrorListeners("Missing closing ']'");} 
         | 'new' id '(' ')'
         | 'new' id '(' {notifyErrorListeners("Missing closing ')'");}
         | '(' expr_new ')'
         | '(' expr_new {notifyErrorListeners("Missing closing ')'");}
         ;

expr_unit : (expr_arith | array| expr_length| expr_this| expr_new);

expr_para : expr_unit '.' id '(' (expr_unit (',' expr_unit)*)? ')'
          | expr_unit '.' id '(' (expr_unit (',' expr_unit)*)? {notifyErrorListeners("Missing closing ')'");} 
          ;

expr: expr_unit | expr_para | '(' expr ')'
    | '(' expr {notifyErrorListeners("Missing closing ')'");} ;

stat : '{' stat '}'
     | '{' stat {notifyErrorListeners("Missing closing '}'");} 
     | 'if' '(' expr ')' stat 'else' stat
     | 'while' '(' expr ')' stat
     | 'System.out.println' '(' expr ')' ';'
     | id '=' expr ';'
     | id '=' expr {notifyErrorListeners("Missing ';'");}
     | array '=' expr ';'
     | array '=' expr {notifyErrorListeners("Missing ';'");}
     ;

varDef : type id ';'
       | type id {notifyErrorListeners("Missing ';'");}
       ;

methodDef : 'public' type id '(' (type id (',' type id )*)? ')' '{' (varDef)* (stat)* 'return' expr ';' '}'
          |'public' type id '(' (type id (',' type id )*)? ')' '{' (varDef)* (stat)* 'return' expr ';' {notifyErrorListeners("Missing ';'");}
          ;

classDef : 'class' id ('extends' id)? '{' (varDef)* (methodDef)* '}'
         | 'class' id ('extends' id)? '{' (varDef)* (methodDef)* {notifyErrorListeners("Missing ';'");}
         ; 

mainClass : 'class' id ('extends' id)? '{' 'public' 'static' 'void' 'main' 
           '(' 'String' '[' ']' id ')' '{' stat '}' '}';

prog: mainClass (classDef)* ;
