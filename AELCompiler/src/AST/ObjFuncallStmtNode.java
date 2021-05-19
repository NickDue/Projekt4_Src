package AST;

import AST.visitors.IVisitor;

public class ObjFuncallStmtNode extends StatementNode{

    public ObjFuncallStmtNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
