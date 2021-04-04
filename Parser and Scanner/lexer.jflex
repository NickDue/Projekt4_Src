import java.io.*;
import java_cup.runtime.*;

%%

%class Lexer
%unicode
%cup
%line
%column
%type		Symbol
%char
%public

%{
  StringBuffer string = new StringBuffer();
  
  private int lineNumber = 1;
  public int lineNumber() { return lineNumber; }

  private Symbol token(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

    LineTerminator = \r|\n|\r\n
    InputCharacter = [^\r\n]
    WhiteSpace     = {LineTerminator} | [ \t\f]

    /* comments */
    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    // Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*

    identifier = [a-zA-Z]+ [a-zA-Z0-9]*
    number = {int} | {float}

    int = 0 | [1-9][0-9]*
    float   = [0-9].[0-9]*
    space = [\ \t]
    newline = \r|\n|\r\n
    
    if = "if"
    else = "else"
    while = "while"
    do = "do"
    loop = “loop”
    times = “times”
    char = “char”
    wait = "wait"
    print = “print”
    when = "when"
    printline =  “printline”
    objid = “button” | “led”
    objfuncid = “read” | “isOn” | “isOff” | "on" | "off"
    milsec = "milsec"
    sec = "sec"
    min = "min"
    hour = "hour"
    time = {int}{hour}{int}{min}{int}{sec}{int}{milsec}
    lparen = "("
    rparen = ")"
    lcurly = "{"
    rcurly = "}"
    lsqbrack = "["
    rsqbrack = "]"
    bool = "true" | "false"
    plusop = "+"
    subop = "-"
    divop = "/"
    timesop = "*"
    
    comma = ","                           
    or = "||"                          
    and = "&&"                           
    noteq = "!="                           
    lthan = "<"                            
    lteq = "<="                           
    gthan = ">"                            
    gteq = ">="                     
    semi = ";"                  
    dot = "."
    equals = "=="
    
%%

    { if } 		{ return token( Sym.IF); }
    { else }		{ return token( Sym.ELSE); }
    { while } 		{ return token( Sym.WHILE); }
    { do }		{ return token( Sym.DO); }
    { loop }		{ return token( Sym.LOOP); }
    { times } 		{ return token( Sym.TIMES); }
    { char }  		{ return token( Sym.CHAR); }
    { print }		{ return token( Sym.PRINT); }
    { printline }	{ return token( Sym.PRINTLN); }
    { objid }		{ return token( Sym.OBJID); }
    { objfuncid }	{ return token( Sym.OBJFUNCID); }
    { milsec }		{ return token( Sym.MILSEC); }
    { sec }		{ return token( Sym.SEC); }
    { min }		{ return token( Sym.MIN); }
    { hour }		{ return token( Sym.HOUR); }
    { time }		{ return token( Sym.TIME); }
    { lparen }		{ return token( Sym.LPAREN); }
    { rparen }		{ return token( Sym.RPAREN); }
    { lcurly }		{ return token( Sym.LCURLY); }
    { rcurly } 	{ return token( Sym.RCURLY); }
    { lsqbrack }	{ return token( Sym.LSQBRACK); }
    { rsqbrack }	{ return token( Sym.RSQBRACK); }
    { bool }		{ return token( Sym.BOOL); }
    { when }		{ return token( Sym.WHEN); }
    
    { comma }		{ return token( Sym.COMMA); }                          
    { or }		{ return token( Sym.OR); }
    { and }		{ return token( Sym.AND); }
    { noteq }		{ return token( Sym.NOTEQ); }
    { lthan } 		{ return token( Sym.LTHAN); }
    { lteq }		{ return token( Sym.LTEQ); }
    { gthan }		{ return token( Sym.GTHAN); }
    { gteq }		{ return token( Sym.GTEQ); }
    { semi }		{ return token( Sym.SEMI); }
    { dot }		{ return token( Sym.DOT); }
    
    { newline }	{ lineNumber++; return token( Sym.NEWLINE ); }
    { space }		{ }

.			{ return token( Sym.ERROR); }
<<EOF>>		{ return token( Sym.EOF ); }