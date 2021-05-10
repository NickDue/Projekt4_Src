package AST;

import AST.visitors.IVisitor;

public class ElseStmtNode extends StatementNode {

    public ElseStmtNode(ASTNode parentNode) {
        super(parentNode);
    }
    
    public ElseStmtNode(ASTNode parentNode, ASTNode body) {
        this(parentNode);
        children.add(body);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
