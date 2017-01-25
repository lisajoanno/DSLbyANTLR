grammar RuleSetGrammar;


@header {
}


dsl : (actuator | sensor | speaker)+ init+ state* ;

// Lexer Rules
sensor : 'sensor' TEXT ':' DIGIT;
actuator : 'actuator' TEXT ':' DIGIT;
speaker : 'speaker' TEXT ':' DIGIT;
serial : ;
init : 'init:' TEXT;
action : (logicalAction | tone | serialPrint);
logicalAction : TEXT '<=' TEXT;
tone : 'tone' TEXT '<=' DIGIT ('hz'|'Hz') 'for' DIGIT 'ms';
serialPrint : 'serialprint' TEXT;
condition : (timeCondition | logicalCondition);
timeCondition : DIGIT 'ms' 'elapsed';
logicalCondition : TEXT 'is' TEXT;
transition :'when' condition ('and' condition)* '=>' TEXT;
state : 'state' TEXT '{' action* transition+ '}';


DIGIT: ('1'..'9')? ('0'..'9')+;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
TEXT : LETTER+ ;

LETTER : ('a'..'z' | 'A'..'Z' | '0'..'9')+ ;
