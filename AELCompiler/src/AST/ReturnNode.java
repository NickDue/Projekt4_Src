package AST;

import AST.visitors.IVisitor;

public class ReturnNode extends StatementNode {

    public ReturnNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
