package AST;

import AST.visitors.IVisitor;

public class ObjFunccallIdNode extends StatementNode{

    public String function;

    public ObjFunccallIdNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
