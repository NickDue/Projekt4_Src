package AST;

import AST.visitors.IVisitor;

public class TimeNode extends StatementNode {

    public long timeValue;

    public TimeNode(ASTNode parentNode) {
        super(parentNode);
    }
    
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
