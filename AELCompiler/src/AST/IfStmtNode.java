package AST;

import AST.visitors.IVisitor;

public class IfStmtNode extends StatementNode {

    public IfStmtNode(ASTNode parentNode) {
        super(parentNode);
    }

    public IfStmtNode(ASTNode parentNode, ASTNode condition, ASTNode statements) {
        this(parentNode);
        children.add(condition);
        children.add(statements);
    }

    public IfStmtNode(ASTNode parentNode, ASTNode condition, ASTNode statements, ASTNode ElseStatement) {
        this(parentNode, condition, statements);
        children.add(ElseStatement);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }


}
