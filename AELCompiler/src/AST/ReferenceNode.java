package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class ReferenceNode extends ExpressionNode implements IAccept {

    public ReferenceNode(ASTNode parentNode) {
        super(parentNode);
    }
    
    public ReferenceNode(ASTNode parent, String name) {
        this(parent);
        children.add(new IdentificationNode(this, name));
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
