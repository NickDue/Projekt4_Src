package AST;

import AST.visitors.IVisitor;

public class ExpressionNode extends ASTNode {

    public ExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);    
    }
    
}
