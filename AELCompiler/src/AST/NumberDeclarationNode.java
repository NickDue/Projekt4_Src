package AST;

import AST.visitors.IVisitor;

public class NumberDeclarationNode extends DeclarationNode {

    public NumberDeclarationNode(ASTNode parentNode) {
        super(parentNode);
        //type = new NumberTypeDescriptor();
    }

    public NumberDeclarationNode(ASTNode parent, String name, ASTNode expression) {
        super(parent, name, expression);
        //type = new NumberTypeDescriptor();
        //children.get(0).type = type;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
