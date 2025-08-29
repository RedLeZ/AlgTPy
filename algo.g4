grammar algo;

varDecl: IDENTIFIER '<-' expr;

program
    : (statement NEWLINE?)* EOF  
    ;

statement
    : varDecl      # VarDeclStatement
    | inputStmt    # InputStatement
    | outputStmt   # OutputStatement
    | ifStmt       # IfStatement
    | whileStmt    # WhileStatement
    | forStmt      # ForStatement
    | jusquaStmt   # JusquaStatement
    ;


block
    : (statement NEWLINE)*
    ;

// ---------------- Input / Output Support ----------------

inputStmt: 'lire' '(' IDENTIFIER (':' typeName)? ')';
outputStmt: 'ecrire' '(' expr ')';


// ------------------ if/else support ------------------

ifStmt
    : 'si' expr 'alors' NEWLINE block (elseifBlock)* (elseBlock)? 'finSi'
    ;

elseifBlock
    : 'sinon' 'si' expr 'alors' NEWLINE block
    ;

elseBlock
    : 'sinon' NEWLINE block
    ;

// ------------------ while / for / Jusqu'a support ------------------

whileStmt
    : 'tantque' expr 'faire' NEWLINE block 'finTantque'
    ;

forStmt
    : 'pour' IDENTIFIER 'de' expr ('à' | 'a')  expr ('pas=' expr)? 'faire' NEWLINE block 'finPour'
    ;

jusquaStmt
    : 'repeter' NEWLINE block NEWLINE 'jusqua' expr
    ;


// ------------------ Expressions ------------------


expr
    : expr op=('*'|'/') expr       # MulDiv
    | expr op=('+'|'-') expr       # AddSub
    | expr op=('<' | '<=' | '>' | '>=' | '==' | '!=' ) expr # Comparison
    | expr op=('et'|'ou') expr     # LogicalAndOr
    | '-' expr                      # Negate
    | '(' expr ')'                  # Parens
    | NUMBER                        # Number
    | BOOLEAN                       # Boolean
    | STRING                        # String
    | CHAR                          # Char
    | IDENTIFIER                    # Variable
    ;

typeName: 'entier' | 'reel' | 'réel' | 'booléen' | 'booleen' | 'bool' | 'caractère' | 'caractere' | 'chaine';

// ------------------ Lexer ------------------
NUMBER: [0-9]+ ('.' [0-9]+)?;
BOOLEAN: 'vrai' | 'faux';
CHAR: '\'' . '\'';
STRING: '"' (~["\r\n])* '"';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

// ------------------ Comments ------------------
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

NEWLINE : [\r\n]+ ;
WS : [ \t]+ -> skip ;

