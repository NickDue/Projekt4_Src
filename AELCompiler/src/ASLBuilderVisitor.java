import ANTLR.AELBaseVisitor;
import ANTLR.AELParser;
import AST.ASTNode;

public class ASLBuilderVisitor extends AELBaseVisitor<ASTNode>{
    public static void main(String[] args) {
        System.out.println("hello world 2!");
    }


    @Override public ASTNode visitProgram(AELParser.ProgramContext ctx){
        return null;
    }

    
}
