grammar RuleSetGrammar;

SYMBOL : '¤' | '#';
SYMBOL_REPEAT : '¤'* | '#'*;

NOTE : (NOTE_NAME | SILENCE) ;

dsl : init macro_def* 'score' score ;

COLOR : 'red' | 'green' | 'blue' ;

NOTE_NAME : 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ;

SILENCE : '$' ;

TEXT : LETTER+ ;

DIGIT : ('0'..'9')+ ;

init : 'color ' COLOR 'speaker ' DIGIT 'screen ' DIGIT 'bpm ' DIGIT 'key ' SYMBOL_REPEAT ;

macro_def : '-' TEXT '- ' '{' ' '? note+ '}' ' '? ;

note : SYMBOL? NOTE DIGIT? ('+' | '-')* '.'? ' '? ;



LETTER : ('a'..'z' | 'A'..'Z')+ ;

score : (note | '-' TEXT ('-' | '- ') | macro_def )+ ;

WHITESPACE : ( '\t' | '\r' | '\n'| '\u000C' )+ -> skip ;
