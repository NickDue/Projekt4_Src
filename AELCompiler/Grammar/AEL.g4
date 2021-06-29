grammar AEL;

program : decl*; 

decl : varDecl 
     | funcDecl 
     | objDecl ;

varDecl : TYPE ID ASSIGN exp SEMICOLON 
        | array ;

funcDecl : TYPE ID fParams funcBody ;

objDecl : ID ASSIGN OBJFUNCID LPAREN intLiteral RPAREN SEMICOLON ;

objFunccall : ID '.' objFunccallId ;

objFunccallId : ONFUNC
              | OFFFUNC 
              //| READFUNC 
              //| WRITEFUNC 
              | ISONFUNC
              | ISOFFFUNC ;

OBJFUNCID : BUTTON 
          | LED;

fParams : LPAREN (fParamsDecl (',' fParamsDecl)*)? RPAREN;

fParamsDecl : TYPE ID ;

funcBody : LCURLY varDecl* stmt* RCURLY ;

stmt : assignExp SEMICOLON
     | printStmt
     | ifStmt
     | doWhileStmt
     | whileStmt
     | loopStmt
     | whenStmt
     | waitStmt
     | returnStmt 
     | funccall SEMICOLON  
     | objFunccall SEMICOLON 
     | exp;

printStmt : PRINT LPAREN exp RPAREN SEMICOLON ;

ifStmt: IF LPAREN logStmt RPAREN LCURLY stmt* RCURLY elseIfStmt* elseStmt?;

elseIfStmt: ELIF LPAREN logStmt RPAREN LCURLY stmt* RCURLY;

elseStmt: ELSE LCURLY stmt* RCURLY;

doWhileStmt: DO LCURLY stmt* RCURLY WHILE LPAREN logStmt RPAREN ;

whileStmt: WHILE LPAREN logStmt RPAREN LCURLY stmt* RCURLY ;

loopStmt: LOOP (intLiteral | ID) TIMES LCURLY stmt* RCURLY;

whenStmt: WHEN LPAREN exp RPAREN LCURLY case_stmt* default_stmt? RCURLY ;

waitStmt: WAIT LPAREN time RPAREN SEMICOLON;

returnStmt: RETURN exp? SEMICOLON ;

time : (intLiteral 'h')? (intLiteral 'm' )? (intLiteral 's' )? (intLiteral 'ms' )?;

case_stmt : term COLON stmt* ';';

default_stmt : 'else' COLON stmt* ';';
     


addexpr : multexpr 
        | multexpr op=(PLUSOP | SUBOP) addexpr 
        ;

multexpr : term
         | term op=(MULTOP | DIVOP) multexpr
         ;

logStmt : addexpr logOp addexpr
          | objFunccall;

logOp : op=(EQUALOP | GREATEROP | LESSOP | GREATEREQUALSOP | LESSSEQUALSOP | NOTEQUALOP | ANDOP | OROP);

assignExp : ID ASSIGN exp;        

term : funccall
     | number
     | STRINGLITERTAL
     | TRUETERM | FALSETERM
     | LPAREN exp RPAREN 
     | ID;    

funccall : ID LPAREN aParams? RPAREN ;

aParams : exp (',' exp)*;

array : TYPE ID LSQ intLiteral RSQ '=' LCURLY arrayval (',' arrayval)* RCURLY SEMICOLON;

exp : assignExp
    | addexpr
    | term ;

arrayval : ID 
         | intLiteral 
         | STRINGLITERTAL
         | TRUETERM 
         | FALSETERM
      /* | ObjIdNode */ ;

TYPE : NUMBERTYPE
     | BOOLEANTYPE
     | VOIDTYPE
     | STRINGTYPE
     | CHARACTERTYPE ;

intLiteral :  NORMALDIGIT+;

floatLiteral : NORMALDIGIT+ '.' NORMALDIGIT+ ;   

STRINGLITERTAL : '"'([a-zA-Z0-9_:\-<>%#$&+/=?!.(),\\[\]* ]|'\\"')*'"' ;

NORMALDIGIT : [0-9] ;

STARTDIGIT : [1-9] ;

number : intLiteral 
       | floatLiteral ;

SEMICOLON : ';' ;       



PLUSOP: '+';
SUBOP: '-' ;
MULTOP: '*';
DIVOP: '/';

ANDOP : 'and';
OROP :'or';
EQUALOP: 'equals';
NOTEQUALOP: 'not equals';
LESSOP:'<'; 
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
//READFUNC:'Read()';
//WRITEFUNC:'Write()'; 
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

PRINT: 'print';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
DO: 'do';
WHILE: 'while';
LOOP: 'loop';
TIMES: 'times';
WHEN: 'when';
WAIT: 'wait';
RETURN: 'return';

ID : [a-zA-Z_-] [a-zA-Z0-9_-]* ;
WS : [ \t\r\n]+ -> skip ;
COMMENT1 : '/*' .*? '*/' -> skip;
COMMENT2 : '//' ~[\r\n]* -> skip;