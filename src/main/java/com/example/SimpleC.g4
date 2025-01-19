grammar SimpleC;

program         : statement* EOF;
statement       : expression ';';
expression      : assignment
                | printfFunc
                | scanfFunc
                | additiveExpression;
assignment      : Ident '=' expression
                | Ident '++'
                | Ident '--';
printfFunc      : 'printf' '(' expression ')';
scanfFunc       : 'scanf' '(' ')';
additiveExpression : multiplicativeExpression (('+' | '-') multiplicativeExpression)*;
multiplicativeExpression : primaryExpression (('*' | '/' | '%') primaryExpression)*;
primaryExpression : Number
                  | Ident
                  | '(' expression ')';

Ident           : [a-zA-Z_][a-zA-Z_0-9]*;
Number          : [0-9]+;
Whitespace      : [ \t\r\n]+ -> skip;
