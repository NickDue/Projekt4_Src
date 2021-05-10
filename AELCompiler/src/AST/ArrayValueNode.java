package AST;

import AST.visitors.IVisitor;

public class ArrayValueNode extends ASTNode {

    public ArrayValueNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
