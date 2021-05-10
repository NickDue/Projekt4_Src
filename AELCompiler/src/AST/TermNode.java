package AST;

import AST.visitors.IVisitor;

public class TermNode extends ASTNode {

    public TermNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
