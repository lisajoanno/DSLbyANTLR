grammar RuleSetGrammar;

SYMBOL : '¤' | '#';

// On le place ici pour que ' ' soit d'abord matché avec ça
NOTE : (NOTE_NAME) ;

WHITESPACE : ( '\t' | '\r' | ' ' | '\n'| '\u000C' )+ -> skip ;

dsl : init macro_def* 'score' score ;

COLOR : 'red' | 'green' | 'blue' ;

NOTE_NAME : 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ;

TEXT : LETTER+ ;

LETTER : ('a'..'z' | 'A'..'Z')+ ;

DIGIT : ('1'..'9')+ ;

init : 'color ' COLOR 'buzzer ' DIGIT 'screen ' DIGIT ;

macro_def : '-' TEXT '- ' '{' ' '? note+ '}' ;

note : SYMBOL? NOTE  DIGIT? ('+' | '-')* '.'? ' '? ;

score : (note | '-' TEXT ('-' | '- '))+;
