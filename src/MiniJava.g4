grammar MiniJava;

@header {
import java.util.*;
}

@members {
    void print(int num){
        System.out.println(num);
    }
    HashMap<String, Object> valueMap = new HashMap<String, Object>();
}


t returns [int v]
: num = INT {$v = $num.int;}
| '(' arith_am = expr_am ')' {$v = $arith_am.v;}
| name = id
{
    try{
        int value = (int)valueMap.get($name.text);
        $v = value;
    }catch(NullPointerException e){
        notifyErrorListeners("Variable "+$name.text+" not defined.");
    }
}
| arith_neg = expr_neg
{
    $v = $arith_neg.v;
}
| '(' arith_t = t ')'
{
    $v = $arith_t.v;
}
;

expr_neg returns [int v]
: '!' arith_t = t {$v = $arith_t.v>0?0:1;}
| '!' arith_and = expr_and {$v = $arith_and.v>0?0:1;}
;

expr_cmp returns [int v]
: num1 = t '>' num2 = t
{
    $v = $num1.v>$num2.v? 1:0;
}
| '(' arith = expr_cmp ')'
{
    $v = $arith.v;
}
| '(' expr_cmp {notifyErrorListeners("Missing closing ')'");}
{
    $v = -1;
}
;

expr_am returns [int v]
: num11 = expr_time '+' num12 = expr_am {$v = $num11.v+$num12.v;}
| num21 = expr_time '-' num22 = expr_am {$v = $num21.v-$num22.v;}
| '(' num3 = expr_am ')' {$v = $num3.v;}
| '(' expr_am {notifyErrorListeners("Missing closing ')'");}
| num4 = expr_time {$v = $num4.v;}
;

expr_time returns [int v]
: num11 = t '*' num12 = expr_time {$v = $num11.v * $num12.v;}
| '(' num2 = expr_time ')' {$v = $num2.v;}
| '(' expr_time {notifyErrorListeners("Missing closing ')'");}
| num3 = t {$v = $num3.v;}
;

expr_and returns [int v]
: num11 = bool AND num12 = bool {$v=($num11.v==1)&&($num12.v==1)?1:0;}
| '(' num2 = expr_and ')' {$v = $num2.v;}
| '(' expr_and {notifyErrorListeners("Missing closing ')'");}
| num3 = bool {$v = $num3.v;}
;

expr_arith returns [int v]
: num1 = expr_am {$v = $num1.v;}
| num2 = expr_and {$v = $num2.v;}
;

array returns [ArrayList v]
: id '[' expr_arith  ']'
| id '[' expr_arith {notifyErrorListeners("Missing closing ']'");}
| '(' array ')'
| '(' array {notifyErrorListeners("Missing closing ')'");}
;

expr_length returns [int v = 0]
: ( array| id) '.' 'length'
| '(' expr_length')'
| '(' expr_length {notifyErrorListeners("Missing closing ')'");}
;

expr_this
: 'this'
| '(' expr_this ')'
| '(' expr_this {notifyErrorListeners("Missing closing ')'");}
;

expr_new
: 'new' type '[' expr_arith ']'
| 'new' type '[' expr_arith ']' {notifyErrorListeners("Missing closing ']'");}
| 'new' id '(' ')'
| 'new' id '(' {notifyErrorListeners("Missing closing ')'");}
| '(' expr_new ')'
| '(' expr_new {notifyErrorListeners("Missing closing ')'");}
;

expr_unit returns [int v]
: num = expr_arith {$v = $num.v;}
| array
| expr_length
| expr_this
| expr_new
;

expr_para
: expr_unit '.' id '(' (expr_unit (',' expr_unit)*)? ')'
| expr_unit '.' id '(' (expr_unit (',' expr_unit)*)? {notifyErrorListeners("Missing closing ')'");}
;

expr returns [int v]
: num1 = expr_unit {$v = $num1.v;print($v);}
| expr_para
| '('num2 =  expr ')' {$v = $num2.v;}
| '(' expr {notifyErrorListeners("Missing closing ')'");}
;

stat
: '{' stat '}'
| '{' stat {notifyErrorListeners("Missing closing '}'");}
| 'if' '(' expr ')' stat 'else' stat
| 'while' '(' expr ')' stat
| 'System.out.println' '(' expr ')' ';'
| name1 = id '=' num1 = expr ';'
{
    try{
        int value = (int)valueMap.get($name1.text);
        valueMap.put($name1.text, $num1.v);
    }catch(NullPointerException e){
        notifyErrorListeners("Variable "+$name1.text+" not defined.");
    }
}
| id '=' expr {notifyErrorListeners("Missing ';'");}
| array '=' expr ';'
| array '=' expr {notifyErrorListeners("Missing ';'");}
;

varDef
: type name = id ';' {valueMap.put($name.text,0);}
| type id {notifyErrorListeners("Missing ';'");}
;

methodDef
: 'public' type id '(' (type id (',' type id )*)? ')' '{' (varDef|stat)* 'return' expr ';' '}'
| 'public' type id '(' (type id (',' type id )*)? ')' '{' (varDef|stat)* 'return' expr ';' {notifyErrorListeners("Missing ';'");}
;

classDef
: 'class' id ('extends' id)? '{' (varDef|methodDef)* '}'
| 'class' id ('extends' id)? '{' (varDef|methodDef)* {notifyErrorListeners("Missing ';'");}
;

mainClass
: 'class' id ('extends' id)? '{' 'public' 'static' 'void' 'main'
'(' 'String' '[' ']' id ')' '{' stat '}' '}'
;

prog:
mainClass (classDef)*
;

bool returns [int v]
: 'true' {$v = 1;}
| 'false' {$v = 0;}
| num = expr_cmp {$v = $num.v;}
;

calculate : (stat|expr|varDef)+;

INT
: '-'? [1-9][0-9]+
| [0-9]
;
DIGIT
: [0-9]
;
UNDERSCORE
: '_'
;
LETTER
: [a-zA-Z]
;
id
: LETTER (LETTER| DIGIT| UNDERSCORE)*
| (DIGIT| UNDERSCORE) (LETTER| DIGIT| UNDERSCORE)* {notifyErrorListeners("ID should start with a letter!");}
;
type
: ( 'int' '[' ']')
| 'boolean'
| 'int'
| id
;
ADD_MINUS
: '+'
| '-'
;

AND
: '&&'
;
WS
: [ \t\r\n]+ -> skip
;
