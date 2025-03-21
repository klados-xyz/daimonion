grammar Entity;

entityFile
    : (entityDeclaration | declaration)* EOF
    ;

entityDeclaration
    : (annotation)* 'entity' IDENTIFIER block
    ;

declaration
    : structDeclaration
    | funcDeclaration
    | funcUnregister
    | varDeclaration ';'
    | assignment ';'
    | functionCall ';'
    ;

annotation
    : '@' IDENTIFIER '(' stringLiteral ')'
    ;

structDeclaration
    : (annotation)+ 'struct' IDENTIFIER block
    ;

funcDeclaration
    : (annotation)+ 'register' 'func' IDENTIFIER '(' parameterList? ')' '->' IDENTIFIER '{' '}'
    ;

funcUnregister
    : 'unregister' 'func' IDENTIFIER ';'
    ;

block
    : '{' (declaration)* '}'
    ;

varDeclaration
    : type IDENTIFIER arraySuffix? ('=' expression)?
    ;

assignment
    : IDENTIFIER '=' expression
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : type IDENTIFIER arraySuffix?
    ;

type
    : IDENTIFIER arraySuffix?
    ;

arraySuffix
    : ('[' ']')+
    ;

expression
    : literal
    | IDENTIFIER
    | functionCall
    | '(' expression ')'
    ;

functionCall
    : IDENTIFIER '(' argumentList? ')'
    ;

argumentList
    : expression (',' expression)*
    ;

literal
    : stringLiteral
    | numberLiteral
    | booleanLiteral
    | arrayLiteral
    ;

stringLiteral
    : STRING
    ;

numberLiteral
    : NUMBER
    ;

booleanLiteral
    : 'true' | 'false'
    ;

arrayLiteral
    : '[' (expression (',' expression)*)? ']'
    ;

IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

STRING
    : '"' ( ~["\\] | '\\' . )* '"'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;