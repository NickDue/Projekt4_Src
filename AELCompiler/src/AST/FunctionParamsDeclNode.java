package AST;

import AST.visitors.IVisitor;

public class FunctionParamsDeclNode extends ASTNode {

    public FunctionParamsDeclNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
