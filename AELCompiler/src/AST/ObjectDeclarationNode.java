package AST;

import AST.visitors.IVisitor;

public class ObjectDeclarationNode extends DeclarationNode {
    public String objId;
    public int pinNumber;

    public ObjectDeclarationNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
    
}
