package AST;

import AST.visitors.IVisitor;

public abstract class StatementNode extends ASTNode{

    public StatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
