grammar AEL;

program : decl*; 

decl : varDecl 
     | funcDecl 
     | objDecl ;

varDecl : type ID (ASSIGN exp)? SEMICOLON 
        | array ;

funcDecl : type ID fParams funcBody ;

objDecl : ID ASSIGN objFuncId LPAREN intLiteral RPAREN SEMICOLON ;

objFunccall : ID '.' objFunccallId ;

objFunccallId : ONFUNC
              | OFFFUNC 
              | READFUNC 
              | WRITEFUNC 
              | ISONFUNC
              | ISOFFFUNC ;

objFuncId : BUTTON 
          | LED;

fParams : LPAREN (fParamsDecl (',' fParamsDecl)*)? RPAREN;

fParamsDecl : type ID ;

funcBody : LCURLY varDecl* stmt* RCURLY ;

stmt : assignExp SEMICOLON 
     | 'print' LPAREN exp RPAREN SEMICOLON 
     | 'if' LPAREN exp RPAREN LCURLY stmt* RCURLY ('elif' LPAREN stmt* RPAREN LCURLY stmt* RCURLY)* ('else' LCURLY stmt* RCURLY)?
     | 'do' LCURLY stmt* RCURLY 'while' LPAREN exp RPAREN 
     | 'while' LPAREN exp RPAREN LCURLY stmt* RCURLY 
     | 'loop' intLiteral 'TIMES' LCURLY stmt* RCURLY
     | 'when' LPAREN exp RPAREN LCURLY case_stmt* default_stmt? RCURLY 
     | 'wait' LPAREN time RPAREN SEMICOLON
     | 'return' exp? SEMICOLON 
     | funccall SEMICOLON  
     | objFunccall SEMICOLON 
     | exp ;

time : (intLiteral 'h')? (intLiteral 'm' )? (intLiteral 's' )? (intLiteral 'ms' )?;

case_stmt : term COLON stmt* ';';

default_stmt : 'else' COLON stmt* ';';

exp : assignExp
    | exp operand exp
    | 'NOT' exp 
    | '-' exp 
    | term ;

assignExp : ID '=' exp;    

operand : PLUSOP
        | SUBOP
        | MULTOP
        | DIVOP
        | ANDOP   
        | OROP
        | EQUALOP   
        | NOTEQUALOP
        | LESSOP
        | GREATEROP
        | LESSSEQUALSOP
        | GREATEREQUALSOP
        ;    

term : ID 
     | number 
     | '"' .*? '"'
     | TRUETERM | FALSETERM
     | LPAREN exp RPAREN 
     | funccall ;    

funccall : ID? LPAREN aParams RPAREN ;

aParams : exp 
          | exp ',' aParams ;

array : type ID LSQ intLiteral RSQ ('=' LCURLY arrayval (',' arrayval)* RCURLY)? SEMICOLON;

arrayval : ID 
         | intLiteral 
         | '"' .*? '"'
         | TRUETERM 
         | FALSETERM;

type : NUMBERTYPE
     | BOOLEANTYPE
     | VOIDTYPE
     | STRINGTYPE
     | CHARACTERTYPE ;

ID : [A-Za-z] [A-Za-z0-9]* ;

intLiteral : NORMALDIGIT+;

floatLiteral : NORMALDIGIT+ '.' NORMALDIGIT+ ;   

NORMALDIGIT : [0-9] ;

STARTDIGIT : [1-9] ;

number : intLiteral 
       | floatLiteral ;

SEMICOLON : ';' ;       

WS : [ \t\r\n]+ -> skip ;

PLUSOP: '+';
SUBOP: '-' ;
MULTOP: '*';
DIVOP: '/';
ANDOP : 'and';
OROP :'or';
EQUALOP: 'equals';
NOTEQUALOP: 'not equals';
LESSOP :'<'; 
GREATEROP: '>'; 
LESSSEQUALSOP:'<='; 
GREATEREQUALSOP: '>=';

TRUETERM: 'true';
FALSETERM: 'false';

NUMBERTYPE: 'number';
BOOLEANTYPE:'bool';
VOIDTYPE:'void';
STRINGTYPE:'string';
CHARACTERTYPE :'char' ;

ONFUNC: 'On()'; 
OFFFUNC:'Off()'; 
READFUNC:'Read()';
WRITEFUNC:'Write()'; 
ISONFUNC:'isOn()'; 
ISOFFFUNC:'isOff()'; 

ASSIGN: '=';
COLON: ':';

LPAREN: '(';
RPAREN: ')';

LCURLY: '{';
RCURLY: '}';
LSQ: '[';
RSQ: ']';

BUTTON: 'BUTTON';
LED: 'LED';