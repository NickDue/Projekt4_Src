package AST;

import AST.visitors.IVisitor;

public class AssignExpressionNode extends ASTNode{

    public AssignExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
