import ANTLR.AELBaseVisitor;
import ANTLR.AELParser;
import ANTLR.AELParser.AssignExpContext;
import ANTLR.AELParser.DeclContext;
import ANTLR.AELParser.ExpContext;
import ANTLR.AELParser.FuncDeclContext;
import ANTLR.AELParser.ObjDeclContext;
import ANTLR.AELParser.ProgramContext;
import ANTLR.AELParser.StmtContext;
import ANTLR.AELParser.VarDeclContext;
import AST.ASTNode;
import AST.AssignmentNode;
import AST.CodeBlockNode;
import AST.IdentificationNode;
import AST.VariableDeclarationNode;
import AST.ProgramNode;

public class ASLBuilderVisitor extends AELBaseVisitor<ASTNode>{
    public static void main(String[] args) {
        System.out.println("hello world 2!");
    }

    @Override
    public ASTNode visitProgram(ProgramContext ctx) {
        ASTNode node = new ProgramNode(null);
        CodeBlockNode stmtNode = new CodeBlockNode(node);
        node.children.add(stmtNode);
        ctx.decl().forEach(child ->{
            stmtNode.children.add(visitDecl((DeclContext)child, stmtNode));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitDecl(AELParser.DeclContext ctx, ASTNode parent) {
        try {
            String name = ctx.children.get(0).getClass().getSimpleName();
            switch(name){
                    case "VarDeclContext":
                        return visitVarDecl((VarDeclContext) ctx.children.get(0), parent);
                        break;
                    case "FuncDeclContext":
                        //return visitFuncDecl((FuncDeclContext) ctx.children.get(0), parent);
                        break;
                    case "ObjDeclContext":
                        //return visitObjDecl((ObjDeclContext) ctx.children.get(0), parent);
                        break;
                default:
                    return null;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ASTNode visitVarDecl(VarDeclContext ctx, ASTNode parent) {
        String id = ctx.ID().getText();
        VariableDeclarationNode node = new VariableDeclarationNode(parent);
        node.children.add(new IdentificationNode(parent, id));
        if (ctx.exp() != null){
            ASTNode child = visitExp((ctx.exp()), node);
            node.children.add(child);
            }
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node; 
    }

    public ASTNode visitExp(ExpContext ctx, ASTNode parent) {
        String name = ctx.children.get(0).toString();
        switch (name){
            case "assignExp":
                return visitAssignExp(ctx.assignExp(), parent);
                break;
            case "exp":
                break;
            case 'NOT':
                break;
            case "-":
                break;
            case "term":
                break;
            default:
                //error
                break;
        }
    }

    public ASTNode visitAssignExp(AssignExpContext ctx, ASTNode parent) {
        
        String id = ctx.ID().getText();
        String exp = ctx.exp().getText();
        AssignmentNode node = new AssignmentNode(parent, id, exp);
        return node;
    
    }




    
}
