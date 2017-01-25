grammar RuleSetGrammar;

SYMBOL : '¤' | '#';
SYMBOL2 : '¤'* | '#'*;

NOTE : (NOTE_NAME) ;

dsl : init macro_def* 'score' score ;

COLOR : 'red' | 'green' | 'blue' ;

NOTE_NAME : 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ;

TEXT : LETTER+ ;

DIGIT : ('0'..'9')+ ;

init : 'color ' COLOR 'speaker ' DIGIT 'screen ' DIGIT 'bpm ' DIGIT 'key ' SYMBOL2 ;

macro_def : '-' TEXT '- ' '{' ' '? note+ '}' ' '? ;

note : SYMBOL? NOTE DIGIT? ('+' | '-')* '.'? ' '? ;

LETTER : ('a'..'z' | 'A'..'Z')+ ;

score : (note | '-' TEXT ('-' | '- ') | macro_def)+ ;

WHITESPACE : ( '\t' | '\r' | '\n'| '\u000C' )+ -> skip ;