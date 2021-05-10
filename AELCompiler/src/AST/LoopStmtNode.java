package AST;

import AST.visitors.IVisitor;

public class LoopStmtNode extends StatementNode{

    public LoopStmtNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
