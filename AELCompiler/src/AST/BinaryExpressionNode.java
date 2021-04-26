package AST;

public class BinaryExpressionNode extends ExpressionNode {

    public String operator;
    
    public BinaryExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }
    
}
