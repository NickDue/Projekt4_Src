grammar AEL;

program : declList* EOF #program; 

declList: decl+ #declarationList;

decl : varDecl #variableDeclaration
     | funcDecl #functionDeclaration
     | objDecl #objectDeclaration;

varDecl : type ID ('=' exp)? SEMICOLON #regularVarDecl
        | array #arrayVarDecl;

funcDecl : type ID fParams funcBody #funcDecl;

objDecl : ID '=' objFuncId '(' intLiteral ')' SEMICOLON #objDecl;

objFunccall : ID '.' objFunccallId #objectFuncCall;

objFunccallId : 'On()' #objOnId
              | 'Off()' #objOffId
              | 'Read()' #objReadId
              | 'Write()' #objWriteId
              | 'isOn()' #objIsOnId
              | 'isOff()' #objIsOffId;

objFuncId : 'BUTTON' #buttonType
          | 'LED' #ledType;

fParams : '(' (fParamsDecl (',' fParamsDecl)*)? ')' #functionParameters;

fParamsDecl : type ID #functionParameterDecl;

funcBody : '{' varDecl* stmt* '}' #functionBody;

stmt : assignExp SEMICOLON #assignStatement
     | 'print' '(' exp ')' SEMICOLON #printStatement
     | 'if' '(' exp ')' '{' stmt* '}' ('elif' '(' stmt* ')' '{' stmt* '}')* ('else' '{' stmt* '}')? #ifStatement
     | 'do' '{' stmt* '}' 'while' '(' exp ')' #doWhileStatement
     | 'while' '(' exp ')' '{' stmt* '}' #whileStatement
     | 'loop' intLiteral 'TIMES' '{' stmt* '}' #loopStatement
     | 'when' '(' exp ')' '{' case_stmt* default_stmt? '}' #whenStatement
     | 'wait' '(' time ')' SEMICOLON #waitStatement
     | 'return' exp? SEMICOLON #returnStatement
     | funccall SEMICOLON  #functionCallStatement
     | objFunccall SEMICOLON #ObjectFuncCallStatement
     | exp #expressionStatement;

time : (intLiteral 'h')? (intLiteral 'm' )? (intLiteral 's' )? (intLiteral 'ms' )? #timeFormat;

case_stmt : term ':' stmt* ';' #caseStatement;

default_stmt : 'else' ':' stmt* ';' #defaultStatement;

exp : assignExp #assignExpression
    | exp operand exp #regularExpression
    | 'NOT' exp #negatedExpression
    | '-' exp #negativeExpression
    | term #termExpression;

assignExp : ID '=' exp #assignment;    

operand : '+' #plusOperand
        | '-' #subOperand
        | '*' #multOperand
        | '/' #divOperand
        | 'and' #andOperand     
        | 'or' #orOperand
        | 'equals' #equalsOperand
        | 'not equals' #notEqualsOperand
        | '<' #lessOperand
        | '>' #greaterOperand
        | '<=' #lessEqualOperand
        | '>=' #greaterEqualOperand
        ;    

term : ID #termIdentifier
     | number #termNumber
     | '"' .* '"' #stringTerm
     | 'true' #trueTerm| 'false' #falseTerm
     | '(' exp ')' #paranExpressionTerm
     | funccall #functionCallTerm;    

funccall : ID? '(' aParams ')' #functionCall;

aParams : exp #arrayParamExp
          | exp ',' aParams #arrayParamExpressions;

array : type ID '[' intLiteral ']' ('=' '{' arrayval (',' arrayval)* '}')? SEMICOLON #arrayDeclaration;

arrayval : ID #idArrayValue
         | intLiteral #intArrayValue
         | '"' .* '"' #stringArrayValue
         | 'true' #trueArrayValue
         | 'false' #falseArrayValue;

type : 'number' #numberType
     | 'bool' #booleanType
     | 'void' #voidType
     | 'string' #stringType
     | 'char' #characterType;

ID : [A-Za-z] [A-Za-z0-9]* ;

intLiteral : NORMALDIGIT+;

floatLiteral : NORMALDIGIT+ '.' NORMALDIGIT+;   

NORMALDIGIT : [0-9] ;

STARTDIGIT : [1-9] ;

number : intLiteral #intLiteralNumber
       | floatLiteral #floatLiteralNumber;

SEMICOLON : ';' ;       

WS : [ \t\r\n]+ -> skip ;
