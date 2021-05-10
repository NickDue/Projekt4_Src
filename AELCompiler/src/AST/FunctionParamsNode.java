package AST;

import AST.visitors.IVisitor;

public class FunctionParamsNode extends ASTNode {

    public FunctionParamsNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
