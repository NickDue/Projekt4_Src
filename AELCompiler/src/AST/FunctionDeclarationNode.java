package AST;

import AST.visitors.IVisitor;

public class FunctionDeclarationNode extends ASTNode {

    public FunctionDeclarationNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
