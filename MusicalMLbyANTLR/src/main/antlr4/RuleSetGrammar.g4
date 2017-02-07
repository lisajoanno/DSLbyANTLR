grammar RuleSetGrammar;

SYMBOL : '¤' | '#' | '=' ;
NOTE : (NOTE_NAME | SILENCE) ;
COLOR : 'red' | 'green' | 'blue' ;
NOTE_NAME : 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ;
SILENCE : '$' ;
CHOICE : 'HIGH' | 'LOW' ;
TEXT : LETTER+ ;
DIGIT : ('0'..'9')+ ;
LETTER : ('a'..'z' | 'A'..'Z')+ ;

init : 'color' COLOR 'speaker' DIGIT 'screen' DIGIT 'bpm' DIGIT 'key' SYMBOL* 'serial' CHOICE ;
macro_def : '-' TEXT '-' '{' note+ '}' ;
note : SYMBOL? NOTE DIGIT? ('+' | '-')* '.'? ;
score : (note | '-' TEXT '-' | macro_def)+ ;
dsl : init macro_def* 'score' score ;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;