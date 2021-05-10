package AST;

import AST.visitors.IVisitor;

public class DefaultNode extends StatementNode {

    public DefaultNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
