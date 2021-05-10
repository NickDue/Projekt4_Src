package AST;

import AST.visitors.IVisitor;

public class PrintNode extends ASTNode {

    public PrintNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
