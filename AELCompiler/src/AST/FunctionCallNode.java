package AST;

import AST.visitors.IVisitor;

public class FunctionCallNode extends ASTNode{

    public FunctionCallNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
