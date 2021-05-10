package AST;

import AST.visitors.IVisitor;

public class CaseNode extends StatementNode{

    public CaseNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
