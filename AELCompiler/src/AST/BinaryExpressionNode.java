package AST;

import AST.visitors.IVisitor;

public class BinaryExpressionNode extends ASTNode{

    public String operator;

    public BinaryExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
