package AST;

import AST.visitors.IVisitor;

public class VariableDeclarationNode extends DeclarationNode {

    public VariableDeclarationNode(ASTNode parentNode) {
        super(parentNode);
        //type = new NumberTypeDescriptor();
    }

    public VariableDeclarationNode(ASTNode parent, String name, ASTNode expression) {
        super(parent, name, expression);
        //type = new NumberTypeDescriptor();
        //children.get(0).type = type;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
