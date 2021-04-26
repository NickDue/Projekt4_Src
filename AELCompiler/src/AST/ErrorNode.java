package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class ErrorNode extends ASTNode implements IAccept {

    public ErrorNode(ASTNode parentNode, String str) {
        super(parentNode);
       // type = new ErrorTypeDescriptor(str); TODO: denne mangler vi
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
