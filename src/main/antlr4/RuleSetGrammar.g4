grammar RuleSetGrammar;

@header {
package grammarGenerated;
}

dsl : init+ state* ;

// Lexer Rules

init : 'init:' TEXT 'is:' TEXT ;
state : 'when:' TEXT 'is:' TEXT 'do:' TEXT 'isnow:' TEXT;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;

TEXT : (DIGIT | LETTER)+ ;
DIGIT : ('0'..'9') ;
LETTER : ('a'..'z' | 'A'..'Z')+ ;