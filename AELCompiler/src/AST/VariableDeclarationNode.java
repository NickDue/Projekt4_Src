package AST;

import AST.visitors.IVisitor;

public class VariableDeclarationNode extends DeclarationNode {


    public VariableDeclarationNode(ASTNode parentNode) {
        super(parentNode);
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
