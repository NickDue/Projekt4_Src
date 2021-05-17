package CodeGeneration;

public class CodeGenStringBuilder {

    private StringBuilder codeGenString = new StringBuilder();
    private int scopeIndentation = 0;


    public void increaseIndent(){
        scopeIndentation++;
    }

    public void decreaseIndent(){
        scopeIndentation--;
    }

    public int getScopeIndentation(){
        return scopeIndentation;
    }

    public String ReturnString(){
        return codeGenString.toString();
    }

    public void AppendText(String text){
        for (int i = 0; i < scopeIndentation; i++){
            codeGenString.append("\t");
        }
        codeGenString.append(text);
        codeGenString.append("\n");
    }

    public void AppendSpace(){
        codeGenString.append("\n");
    }

    public void AppendMain(){
        AppendText("void loop() {");
        scopeIndentation++;

    }

    public void AppendObjectDeclarations(){
        AppendText("void setup() {");
        scopeIndentation++;
    }

    public void AppendCloseObjectDeclarations(){
        AppendSpace();
        scopeIndentation--;
        AppendText("}");
    }

    public void AppendComment(String text){
        for(int i = 0; i < scopeIndentation; i++){
            codeGenString.append("\t");
        }
        codeGenString.append("/* ");
        codeGenString.append(text);
        codeGenString.append(" */\n");
    }

    public void AppendCloseMain(){
        AppendSpace();
        scopeIndentation--;
        AppendText("}");
    }
    

    public void AppendFunctionDeclaration(){

    }

    public void AppendVariableDeclaration(){

    }

  
    
}
