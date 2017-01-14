grammar RuleSetGrammar;

@header {
}

dsl : (actuator | sensor)+ init+ state* ;

// Lexer Rules
sensor : 'sensor' TEXT ':' DIGIT;
actuator : 'actuator' TEXT ':' DIGIT;
init : 'init:' TEXT;
action : TEXT '<=' TEXT;
condition : TEXT 'is' TEXT;
transition :'when' condition ('and' condition)* '=>' TEXT;
state : 'state' TEXT '{' action* transition+ '}';


DIGIT: ('1'..'9')? ('0'..'9')+;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
TEXT : LETTER+ ;

LETTER : ('a'..'z' | 'A'..'Z' | '0'..'9')+ ;