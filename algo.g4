grammar algo;

// ------------------- Program -------------------

program
        : ('algorithme' | 'Algorithme') IDENTIFIER NEWLINE+
            ((tdntDecl | tdoDecl) NEWLINE*)*
            ('début' | 'Debut' | 'Début' | 'debut') NEWLINE
            block
            ('fin' | 'Fin' | 'FIN')
        ;

// ------------------- TDNT / TDO -------------------

tdntDecl
    : 'TDNT' (':' )? NEWLINE (newTypeDecl NEWLINE)+ ('fin_tdnt' NEWLINE)?
    ;

newTypeDecl
    : IDENTIFIER '=' 'enregistrement' NEWLINE
          (IDENTIFIER ':' typeName ',' NEWLINE)+
      'fin'
    | IDENTIFIER '=' 'tableau' 'de' NUMBER typeName
    ;

tdoDecl
    : 'TDO' (':' )? NEWLINE (varDecl NEWLINE)+ ('fin_tdo' NEWLINE)?
    ;

varDecl
    : IDENTIFIER ':' typeName
    | IDENTIFIER ':' 'tableau' 'de' NUMBER typeName
    ;

// ------------------- Block / Statements -------------------

block
    : (statement NEWLINE | NEWLINE)*
    ;

statement
    : inputStmt        # InputStatement
    | outputStmt       # OutputStatement
    | openFileStmt     # OpenFileStatement
    | closeFileStmt    # CloseFileStatement
    | ifStmt           # IfStatement
    | whileStmt        # WhileStatement
    | forStmt          # ForStatement
    | jusquaStmt       # JusquaStatement
    | selonStmt        # SelonStatement
    | procedureDecl    # ProcedureDeclaration
    | functionDecl     # FunctionDeclaration
    | funcCall         # FunctionCallStatement
    | assignStmt       # AssignStatement
    ;

// ------------------- File I/O -------------------

openFileStmt
    : 'ouvrir' '(' IDENTIFIER ',' IDENTIFIER  ',' fileMode ')'
    ;

fileMode
    : IDENTIFIER
    | CHAR
    ;

closeFileStmt
    : 'fermer' '(' IDENTIFIER ')'
    ;
// ------------------- Input / Output -------------------

inputStmt
    : 'lire' '('(IDENTIFIER ',')?  IDENTIFIER (':' typeName)?')'
    ;

outputStmt
    : ('écrire'|'ecrire') '('(IDENTIFIER ',')? expr (',' expr)* ')' 
    ;

// ------------------- Control Structures -------------------

ifStmt
    : 'si' expr 'alors' NEWLINE block
      (('sinon' 'si' | 'sinonsi' | 'SinonSi' | 'sinonSi') expr 'alors' NEWLINE block)*
      ('sinon' NEWLINE block)?
      ('fin_si' | 'finsi')
    ;

whileStmt
    : ('tant' 'que' | 'tantque') expr 'faire' NEWLINE block ('fin_tant_que' | 'fintantque')
    ;

forStmt
    : ('pour'|'Pour') IDENTIFIER 'de' expr ('à' | 'a') expr ('pas' ('=')? expr)? 'faire' NEWLINE block ('fin_pour' | 'finpour')
    ;

jusquaStmt
    : ('répéter' | 'repeter' | 'Répéter' | 'Repeter') NEWLINE block ('jusqu’à' | 'jusqua' | 'jusqu\'a') expr
    ;

selonStmt
    : 'selon' expr NEWLINE
      ( 'cas' expr ':' NEWLINE block )+
            (('autres' | 'sinon') ':' NEWLINE block)?
      'fin_selon'
    ;

// ------------------- Procedures / Functions -------------------

procedureDecl
        : ('procedure'|'procédure'|'Procédure'|'Procedure') IDENTIFIER '(' paramList? ')' NEWLINE
            ('Debut' | 'début' | 'Début' | 'debut') NEWLINE
      block
            ('Fin' | 'fin' | 'fin_procedure' | 'fin_procédure')
    ;

functionDecl
        : ('fonction'|'Fonction') IDENTIFIER '(' paramList? ')' ':' typeName NEWLINE
            ('Debut' | 'début' | 'Début' | 'debut') NEWLINE
      block
      'retourner' expr NEWLINE
            ('Fin' | 'fin' | 'fin_fonction')
    ;

paramList
    : param (',' param)*
    ;

param
    : ('@')? IDENTIFIER ':' typeName
    ;

// ------------------- Function / Procedure Calls -------------------

funcCall
    : IDENTIFIER '(' ((('@')? expr) (',' ('@')? expr)*)? ')'
    ;

// ------------------- Expressions -------------------

expr
    : expr op=('*'|'/') expr           # MulDiv
    | expr op=('+'|'-') expr           # AddSub
    | expr op=('<'|'<='|'≤'|'>'|'>='|'≥'|'='|'=='|'!='|'≠'|'∈') expr  # Comparison
    | expr op=('et'|'ou'|'ouex') expr # Logical
    | 'non' expr                       # Negate
    | '(' expr ')'                     # Parens
    | IDENTIFIER '[' expr ']'          # Index
    | funcCall                         # FuncCallExpr
    | NUMBER                           # Number
    | BOOLEAN                          # Boolean
    | STRING                           # String
    | CHAR                             # Char
    | IDENTIFIER                       # Variable
    ;

assignStmt
    : IDENTIFIER ('[' expr ']')? ('<-' | ':=') expr
    ;

// ------------------- Types -------------------

typeName
    : 'entier'
    | 'réel'
    | 'reel'
    | 'booléen'
    | 'booleen'
    | 'bool'
    | 'caractère'
    | 'caractere'
    | 'chaîne'
    | 'chaine'
    | 'enregistrement'
    | 'tableau' typeName?
    | 'fichier'
    ;

// ------------------- Lexer -------------------

NUMBER: [0-9]+ ('.' [0-9]+)?;
BOOLEAN: 'vrai' | 'faux' | 'VRAI' | 'FAUX';
CHAR: '\'' . '\'';
STRING: '"' (~["\r\n])* '"';
// Explicit keywords to avoid being lexed as IDENTIFIER
TDNT: 'TDNT';
TDO: 'TDO';

IDENTIFIER : [a-zA-Z_éèàçÉÈÀÇ][a-zA-Z0-9_éèàçÉÈÀÇ]* ;

// ------------------- Comments -------------------

LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// ------------------- Whitespace -------------------

NEWLINE : [\r\n]+ ;
WS : [ \t]+ -> skip ;
