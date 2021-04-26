package AST;

import AST.visitors.IVisitor;

public class SubscriptingAssignementNode extends AssignmentNode {

    public SubscriptingAssignementNode(ASTNode parentNode) {
        super(parentNode);
    }
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
