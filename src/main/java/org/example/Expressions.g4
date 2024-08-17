grammar Expressions;

expr:   expr ('*' | '/') expr   # MulDiv
    |   expr ('+' | '-') expr   # AddSub
    |   INT                     # Int
    |   '(' expr ')'            # Parens
    ;

INT : [0-9]+;
WS  : [ \t\n\r]+ -> skip;
