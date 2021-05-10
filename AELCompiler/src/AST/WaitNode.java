package AST;

import AST.visitors.IVisitor;

public class WaitNode extends StatementNode {

    public WaitNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
