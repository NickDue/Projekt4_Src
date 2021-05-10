package AST;

import AST.visitors.IVisitor;

public class ElseIfStmtNode extends StatementNode {

    public ElseIfStmtNode(ASTNode parentNode) {
        super(parentNode);
    }

    public ElseIfStmtNode(ASTNode parentNode, ASTNode condition, ASTNode body) {
        this(parentNode);
        children.add(condition);
        children.add(body);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
