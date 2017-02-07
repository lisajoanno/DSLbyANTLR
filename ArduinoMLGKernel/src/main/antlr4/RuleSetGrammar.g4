grammar RuleSetGrammar;


@header {
}


dsl : (actuator | sensor | speaker)+ init+ serial? debounce? state* ;

// Lexer Rules
debounce: 'debounce : ' DIGIT;
sensor : 'sensor' TEXT ':' DIGIT;
actuator : 'actuator' TEXT ':' DIGIT;
speaker : 'speaker' TEXT ':' DIGIT;
serial : 'serial' binaryState;
init : 'init:' TEXT;
action : (logicalAction | tone | serialPrint);
serialPrint : 'serialPrint' TEXT;
logicalAction : TEXT '<=' binaryState;
tone : 'tone' TEXT '<=' DIGIT ('hz'|'Hz') 'for' DIGIT 'ms';

condition : (timeCondition | logicalCondition);
timeCondition : DIGIT 'ms' 'elapsed';
logicalCondition : TEXT 'is' binaryState;
transition :'when' condition ('and' condition)* '=>' TEXT;
state : 'state' TEXT '{' action* transition*'}';
binaryState : ('HIGH' | 'LOW');


DIGIT: ('1'..'9')? ('0'..'9')+;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
TEXT : LETTER+ ;

LETTER : ('a'..'z' | 'A'..'Z' | '0'..'9')+ ;
