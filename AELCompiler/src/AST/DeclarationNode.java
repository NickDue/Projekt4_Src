package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class DeclarationNode extends StatementNode implements IAccept {

    public DeclarationNode(ASTNode parentNode) {
        super(parentNode);
        terminatesNormally = true;
    }

    public DeclarationNode(ASTNode parentNode, String name) {
        this(parentNode);
        children.add(new IdentificationNode(this, name));
    }

    public DeclarationNode(ASTNode parentNode, String name, ASTNode expression) {
        this(parentNode, name);
        children.add(expression);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
