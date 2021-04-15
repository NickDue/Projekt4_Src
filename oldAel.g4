grammar oldAel;

program : prog+ 'EOF'
        ;

prog : func
     | '/*' ID '*/'
     | dcl
     | obj
     ;

func : type ID '(' param ')' '{' stmts '}';

type : ;

ID : [A-Za-z]+ ;

param : type ID params;

params : (',' type ID)*;

stmts : stmt+;

stmt : expr_stmt
     | selection_stmt
     | iterative_stmt
     | jump_stmt
     ;

expr_stmt : function_call
          | assignment
          | print;

function_call : ID '(' actparams ')';

actparams : ;

assignment : ;

print : ;

selection_stmt : 'if' '(' bool ')' compoundstmt elif
               | 'switch' '(' value ')' '{' case_stmt* default_stmt '}';

case_stmt : 'case' expr (',' 'case' expr)* ':' exprs 'break;';

default_stmt : 'default' ':' expr* 'break';

elif : 'else' selection_stmt
     | 'else' compoundstmt
     | ;

compoundstmt : '{' block '}'; 

block : dcl '\n'
      | stmts '\n'
      | '\n' block;

iterative_stmt : whilestmt
               | dowhile
               | forloop;

whilestmt : 'while' '(' bool ')' compoundstmt;

dowhile : 'do' compoundstmt 'while' '(' bool ')' ';';

forloop : 'loop' NUMBER 'times'compoundstmt;

bool : value logop value nestbool
     | '!'? ID nestbool
     | '!'? '(' value logop value ')' nestbool;  

nestbool : (logope value logop value)
         | (logope '!' ID)
         | (logope value logop value);

logope : 'and'
       | 'or';

logop : '>'
      | '<'
      | '=='
      | '!='
      | '>='
      | '<=';

jump_stmt : 'return' expr ';';

value : NUMBER
      | ID
      | '"' ID '"'
      | '\'' ID '\'' /* i dont get it */
      | 'true'
      | 'false';

expr : ;

dcl : type ID '=' exprs ';';

obj : ID '=' objid '(' NUMBER ')' ';';

objid : 'BUTTON'
      | 'LED';

NUMBER : [1-9] [0-9]*
       | '0' '.' [0-9]+
       ;

exprs : expr+
      | ('(' expr+ ')')+;

/* missing arrays */