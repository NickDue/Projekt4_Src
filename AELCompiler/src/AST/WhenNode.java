package AST;

import AST.visitors.IVisitor;

public class WhenNode extends StatementNode{

    public WhenNode(ASTNode parentNode) {
        super(parentNode);
    }
    
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
