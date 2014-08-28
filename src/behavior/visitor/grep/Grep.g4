/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Grep;

grep : 'grep'  WS* pattern+ 'from' target(',' WS* target)* WS* EOF ;

pattern :   star|
            dot|
            string;
target : ID;
string : ID;
star: '*';
dot: '.';
 
ID: (LETTER|DIGIT)+;

fragment 
LETTER      :[a-zA-Z];

fragment 
DIGIT       :   [0-9] ;

WS          :   [ \t\n\r]+ -> skip ; 

COMMENT:
           '/*' .*? '*/'  -> channel(HIDDEN)
      ;
LINE_COMMENT:
           '//' ~[\r\n]* ('\r'? '\n' | EOF)  -> channel(HIDDEN)	;
