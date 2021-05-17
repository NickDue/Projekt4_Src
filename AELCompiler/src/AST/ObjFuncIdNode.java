package AST;

import AST.visitors.IVisitor;

public class ObjFuncIdNode extends StatementNode{

    public String pinType;

    public ObjFuncIdNode(ASTNode parentNode) {
        super(parentNode);
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
