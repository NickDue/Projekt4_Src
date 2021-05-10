package AST;

import AST.visitors.IVisitor;

public class DeclarationNode extends ASTNode {

    public DeclarationNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        
    }
    
}
