package AST;


import AST.visitors.IVisitor;

public class ArrayNode extends ASTNode{

    public ArrayNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
