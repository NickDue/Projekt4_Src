package AST;


public class ExpressionNode extends StatementNode {

    public ExpressionNode(ASTNode parentNode) {
        super(parentNode);
        terminatesNormally = true;
    }
    
}
