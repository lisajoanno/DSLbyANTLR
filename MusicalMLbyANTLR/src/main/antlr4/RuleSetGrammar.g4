grammar RuleSetGrammar;

SYMBOL : '¤' | '#';
SYMBOL_REPEAT : '¤'* | '#'*;
NOTE : (NOTE_NAME | SILENCE) ;
COLOR : 'red' | 'green' | 'blue' ;
NOTE_NAME : 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ;
SILENCE : '$' ;
TEXT : LETTER+ ;
DIGIT : ('0'..'9')+ ;
LETTER : ('a'..'z' | 'A'..'Z')+ ;

init : 'color' COLOR 'speaker' DIGIT 'screen' DIGIT 'bpm' DIGIT 'key' SYMBOL_REPEAT ;
macro_def : '-' TEXT '-' '{' note+ '}' ;
note : SYMBOL? NOTE DIGIT? ('+' | '-')* '.'? ;
score : (note | '-' TEXT '-' | macro_def)+ ;
dsl : init macro_def* 'score' score ;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;