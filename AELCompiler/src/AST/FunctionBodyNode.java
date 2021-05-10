package AST;

import AST.visitors.IVisitor;

public class FunctionBodyNode extends ASTNode {

    public FunctionBodyNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
