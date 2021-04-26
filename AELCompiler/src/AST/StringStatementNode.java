package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class StringStatementNode extends StatementNode implements IAccept {

    public StringStatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    public StringStatementNode(ASTNode parentNode, ASTNode value, ASTNode appendString) {
        this(parentNode);
        children.add(value);
        children.add(appendString);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
