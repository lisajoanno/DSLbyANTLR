grammar RuleSetGrammar;

@header {
   package grammar;
}

SYMBOL : '¤' | '#' | '=' ;
KEY_ALT : ('¤')* | ('#')* ;
NOTE : (NOTE_NAME | SILENCE) ;
COLOR : 'red' | 'green' | 'blue' | 'white' ;
NOTE_NAME : 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ;
SILENCE : '$' ;
CHOICE : 'HIGH' | 'LOW' ;
TEXT : LETTER+ ;
DIGIT : ('0'..'9')+ ;
LETTER : ('a'..'z' | 'A'..'Z')+ ;

init_color : 'color' COLOR ;
init_speaker : 'speaker' DIGIT ;
init_screen : 'screen' DIGIT ;
init_bpm : 'bpm' DIGIT ;
init_key : 'key' KEY_ALT ;
init_serial : 'serial' CHOICE ;

init : init_color init_speaker init_screen init_bpm init_key init_serial ;
macro_def : '-' TEXT '-' '{' note+ '}' ;
note : SYMBOL? NOTE DIGIT? ('+' | '-')* '.'? ;
score : (note | '-' TEXT '-' | macro_def)+ ;
dsl : init macro_def* 'score' score ;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;



