grammar AEL;

program : declList* EOF;

declList: decl+;

decl : varDecl
     | funcDecl
     | objDecl;

varDecl : type ID ('=' exp)? SEMICOLON
        | array;

funcDecl : type ID fParams funcBody;

objDecl : ID '=' objFuncId '(' intLiteral ')' SEMICOLON;

objFunccall : ID '.' objFunccallId;

objFunccallId : 'On()'
              | 'Off()'
              | 'Read()'
              | 'Write()'
              | 'isOn()'
              | 'isOff()';

objFuncId : 'BUTTON'
          | 'LED';

fParams : '(' (fParamsDecl (',' fParamsDecl)*)? ')';

fParamsDecl : type ID;

funcBody : '{' varDecl* stmt* '}';

stmt : assignExp SEMICOLON
     | 'print' '(' exp ')' SEMICOLON
     | 'if' '(' exp ')' '{' stmt* '}' ('elif' '(' stmt* ')' '{' stmt* '}')* ('else' '{' stmt* '}')?
     | 'do' '{' stmt* '}' 'while' '(' exp ')'
     | 'while' '(' exp ')' '{' stmt* '}'
     | 'loop' intLiteral 'TIMES' '{' stmt* '}'
     | 'when' '(' exp ')' '{' case_stmt* default_stmt? '}'
     | 'wait' '(' time ')' SEMICOLON
     | 'return' exp? SEMICOLON
     | funccall SEMICOLON 
     | objFunccall SEMICOLON
     | exp;

time : (intLiteral 'h')? (intLiteral 'm' )? (intLiteral 's' )? (intLiteral 'ms' )? ;

case_stmt : term ':' stmt* ';';

default_stmt : 'else' ':' stmt* ';';

exp : assignExp
    | exp operand exp
    | 'NOT' exp
    | '-' exp
    | term;

assignExp : ID '=' exp;    

operand : '+'
        | '-'
        | '*'
        | '/'
        | 'and'     
        | 'or'
        | 'equals'
        | 'not equals'
        | '<'
        | '>'
        | '<='
        | '>='
        ;    

term : ID
     | number
     | '"' (ID)* '"' /* mangler flere tegn */
     | 'true' | 'false'
     | '(' exp ')'
     | funccall;    

funccall : ID? '(' aParams ')';

aParams : exp
          | exp ',' aParams;

array : type ID '[' intLiteral ']' ('=' '{' arrayval (',' arrayval)* '}')? SEMICOLON;

arrayval : ID
         | intLiteral
         | '"' (ID)* '"' /* mangler flere tegn */
         | 'true' 
         | 'false';

type : 'number'
     | 'bool'
     | 'void'
     | 'string'
     | 'char';

ID : [A-Za-z] [A-Za-z0-9]* ;

intLiteral : NORMALDIGIT+;

floatLiteral : NORMALDIGIT+ '.' NORMALDIGIT+;   

NORMALDIGIT : [0-9] ;

STARTDIGIT : [1-9] ;

number : intLiteral
       | floatLiteral;

SEMICOLON : ';' ;       

WS : [ \t\r\n]+ -> skip ;
