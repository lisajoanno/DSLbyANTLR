grammar RuleSetGrammar;

SYMBOL : '@' | '*';

// On le place ici pour que ' ' soit d'abord matché avec ça
NOTE : (NOTE_NAME ' '?) ;

WHITESPACE : ( '\t' | '\r' | ' ' | '\n'| '\u000C' )+ -> skip ;

dsl : init macro_def* 'score' score ;

COLOR : 'red' | 'green' | 'blue' ;

NOTE_NAME : 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ;

TEXT : LETTER+ ;

LETTER : ('a'..'z' | 'A'..'Z')+ ;

PIN : ('1'..'9')+ ;

init : 'color ' COLOR 'buzzer ' PIN 'screen ' PIN ;

macro_def : '-' TEXT '- ' '{' note+ '}' ;

note : SYMBOL? NOTE ;

score : (note | '-' TEXT ('-' | '- '))+;
