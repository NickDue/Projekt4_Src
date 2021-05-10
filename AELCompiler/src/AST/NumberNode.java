package AST;

import AST.visitors.IVisitor;

public class NumberNode extends ASTNode {

    public NumberNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
