package AST;

import AST.visitors.IVisitor;

public class ObjIdNode extends ASTNode {

    public String objType;

    public ObjIdNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
