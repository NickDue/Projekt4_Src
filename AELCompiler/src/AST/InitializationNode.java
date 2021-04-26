package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class InitializationNode extends ASTNode implements IAccept {
    public String identifier;

    public InitializationNode(ASTNode parentNode, String id) {
        super(parentNode);
        identifier = id;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
