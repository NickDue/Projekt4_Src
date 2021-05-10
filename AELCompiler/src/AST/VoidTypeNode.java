package AST;

import AST.visitors.IVisitor;

public class VoidTypeNode extends TypeNodesNode{

    public VoidTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "void";
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
