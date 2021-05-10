package AST;

import AST.visitors.IVisitor;

public class DoWhileNode extends StatementNode {

    public DoWhileNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DoWhileNode(ASTNode parentNode, ASTNode condition, ASTNode statements) {
        this(parentNode);
        children.add(condition);
        children.add(statements);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
