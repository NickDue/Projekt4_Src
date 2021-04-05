import java_cup.runtime.*; // defines the Symbol class

// The generated scanner will return a Symbol for each token that it finds.
// A Symbol contains an Object field named value; that field will be of type
// TokenVal, defined below.
//
// A TokenVal object contains the line number on which the token occurs as
// well as the number of the character on that line that starts the token.
// Some tokens (literals and IDs) also include the value of the token.

class TokenVal {
  // fields
    int linenum;
    int charnum;
  // constructor
    TokenVal(int line, int ch) {
        linenum = line;
        charnum = ch;
    }
}

class NumberToken extends TokenVal {
  // new field: the value of the integer or double
    int intVal;
    double doubleVal;
  // constructor
    NumberTokenINT(int line, int ch, int val) {
        super(line, ch);
        intVal = val;
    }
    
    NumberTokenFLOAT(int line, int ch, double val) {
        super(line, ch);
    	doubleVal = val;
    }
}

class IdTokenVal extends TokenVal {
  // new field: the value of the identifier
    String idVal;
  // constructor
    IdTokenVal(int line, int ch, String val) {
        super(line, ch);
    idVal = val;
    }
}

class StrLitTokenVal extends TokenVal {
  // new field: the value of the string literal
    String strVal;
  // constructor
    StrLitTokenVal(int line, int ch, String val) {
        super(line, ch);
        strVal = val;
    }
}

// The following class is used to keep track of the character number at which
// the current token starts on its line.
class CharNum {
    static int num=1;
}
%%

DIGIT=        [0-9]
WHITESPACE=   [\040\t]
LETTER=       [a-zA-Z]
ESCAPEDCHAR=   [nt'\"?\\]
NOTNEWLINEORESCAPEDCHAR=   [^\nnt'\"?\\]
NOTNEWLINEORQUOTE= [^\n\"]
NOTNEWLINEORQUOTEORESCAPE= [^\n\"\\]

%implements java_cup.runtime.Scanner
%function next_token
%type java_cup.runtime.Symbol

%eofval{
return new Symbol(sym.EOF);
%eofval}

%line

%%

/* Data typer */

"true"    { Symbol S = new Symbol(sym.TRUE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"false"   { Symbol S = new Symbol(sym.FALSE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }       
          
"char"    { Symbol S = new Symbol(sym.CHAR, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"bool"    { Symbol S = new Symbol(sym.BOOLTYPE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"void"    { Symbol S = new Symbol(sym.VOID, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }          
                    
"BUTTON"    { Symbol S = new Symbol(sym.BUTTON, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

"LED"     { Symbol S = new Symbol(sym.LED, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
          
/* Tids intervaller */
          
"milsec"  { Symbol S = new Symbol(sym.MILSEC, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

"sec"     { Symbol S = new Symbol(sym.SEC, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"min"     { Symbol S = new Symbol(sym.MIN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

"hour"    { Symbol S = new Symbol(sym.HOUR, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          



/* Output */          
         
"print"    { Symbol S = new Symbol(sym.PRINT, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

"println" { Symbol S = new Symbol(sym.PRINTLN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

/* Kontrol strukturer */
          
"if"      { Symbol S = new Symbol(sym.IF, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"elif"    { Symbol S = new Symbol(sym.ELIF, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          
"else"    { Symbol S = new Symbol(sym.ELSE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"do"      { Symbol S = new Symbol(sym.DO, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"while"   { Symbol S = new Symbol(sym.WHILE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"loop"    { Symbol S = new Symbol(sym.LOOP, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
          
"when"    { Symbol S = new Symbol(sym.WHEN, new TokenVal(yyline+1, 	
            CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

"times"   { Symbol S = new Symbol(sym.TIMES, new TokenVal(yyline+1, 	
            CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

          
"return"  { Symbol S = new Symbol(sym.RETURN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }


/* Time */

({DIGIT}{HOUR})*({DIGIT}{MIN})*({DIGIT}{SEC})*({DIGIT}{MILSEC})* {
            Symbol S = new Symbol(sym.TIME, new IdTokenVal(yyline+1, CharNum.num, 
            yytext()));
            CharNum.num += yytext().length();
            return S;
          }

/* Identifier */

({LETTER})({LETTER}|{DIGIT}|"_")* {
            Symbol S = new Symbol(sym.ID, 
                             new IdTokenVal(yyline+1, CharNum.num, yytext()));
            CharNum.num += yytext().length();
            return S;
          }

/* Number */
({DIGIT}+ | {DIGIT}+{DOT}{DIGIT}+)  { 

            String checkString = yytext();
            
            int intVal;
            double doubleVal;
            
            if(checkString.contains(".")){
                doubleVal = Double.parseDouble(checkString);
                if(doubleVal > Double.MAX_VALUE){
                    ErrMsg.warn(yyline+1, CharNum.num,
                            "value of double is too large; using max value");
                    doubleVal = Double.MAX_VALUE;
                    Symbol S = new Symbol(sym.NUMBER,
                             new NumberTokenFLOAT(yyline+1, CharNum.num, intVal));
                    CharNum.num += yytext().length();
	    }
	    
	    else {
                if (val > Integer.MAX_VALUE) {
                ErrMsg.warn(yyline+1, CharNum.num,
                            "integer literal too large; using max value");
                intVal = Integer.MAX_VALUE;
            } else {
                intVal = Integer.parseInt(yytext());
                Symbol S = new Symbol(sym.NUMBER,
                             new NumberTokenINT(yyline+1, CharNum.num, intVal));
                CharNum.num += yytext().length();
            }
           
            return S;
          }
          

/* Newline, quote og escapes */
          
\"({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})*\" {
            String strVal = yytext();
            Symbol S = new Symbol(sym.STRINGLITERAL,
                             new StrLitTokenVal(yyline+1, CharNum.num, strVal));
            CharNum.num += yytext().length();
            return S;
          }
          
\"({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})* {
            // unterminated string
            ErrMsg.fatal(yyline+1, CharNum.num,
                         "unterminated string literal ignored");
          }
          
\"({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})*\\{NOTNEWLINEORESCAPEDCHAR}({NOTNEWLINEORQUOTE})*\" {
            // bad escape character
            ErrMsg.fatal(yyline+1, CharNum.num,
                         "string literal with bad escaped character ignored");
            CharNum.num += yytext().length();
          }
          
\"({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})*(\\{NOTNEWLINEORESCAPEDCHAR})?({NOTNEWLINEORQUOTEORESCAPE}|\\{ESCAPEDCHAR})*\\? {
            // bad escape character
            ErrMsg.fatal(yyline+1, CharNum.num,
             "unterminated string literal with bad escaped character ignored");
          }          
          
\n        { CharNum.num = 1; }

{WHITESPACE}+  { CharNum.num += yytext().length(); }

("//")[^\n]*  { // comment - ignore. Note: don't need to update char num 
            // since everything to end of line will be ignored
          }

/* Parenteser og operatorer */

"{"       { Symbol S = new Symbol(sym.LCURLY, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"}"       { Symbol S = new Symbol(sym.RCURLY, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
          
"("       { Symbol S = new Symbol(sym.LPAREN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

")"       { Symbol S = new Symbol(sym.RPAREN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"["       { Symbol S = new Symbol(sym.LSQBRACK, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

"]"       { Symbol S = new Symbol(sym.RSQBRACK, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }

";"       { Symbol S = new Symbol(sym.SEMICOLON, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
          
","       { Symbol S = new Symbol(sym.COMMA, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }          
          
"."       { Symbol S = new Symbol(sym.DOT, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }          
                    
"+"       { Symbol S = new Symbol(sym.PLUS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
          
"-"       { Symbol S = new Symbol(sym.MINUS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }          
          
"*"       { Symbol S = new Symbol(sym.TIMES, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }              
          
"/"       { Symbol S = new Symbol(sym.DIVIDE, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"!"       { Symbol S = new Symbol(sym.NOT, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
          
"AND"      { Symbol S = new Symbol(sym.AND, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }

"OR"      { Symbol S = new Symbol(sym.OR, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }

"EQUALS"  { Symbol S = new Symbol(sym.EQUALS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }
          
"NOTEQ"   { Symbol S = new Symbol(sym.NOTEQUALS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }          
          
"<"       { Symbol S = new Symbol(sym.LESS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }              
          
">"       { Symbol S = new Symbol(sym.GREATER, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }

"<="      { Symbol S = new Symbol(sym.LESSEQ, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }

">="      { Symbol S = new Symbol(sym.GREATEREQ, new TokenVal(yyline+1, CharNum.num));
            CharNum.num += 2;
            return S;
          }          

"="       { Symbol S = new Symbol(sym.ASSIGN, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }    

.         { ErrMsg.fatal(yyline+1, CharNum.num,
                         "illegal character ignored: " + yytext());
            CharNum.num++;
          }