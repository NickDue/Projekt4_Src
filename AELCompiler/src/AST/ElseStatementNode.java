package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class ElseStatementNode extends StatementNode implements IAccept {

    public ElseStatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    public ElseStatementNode(ASTNode parentNode, ASTNode body) {
        this(parentNode);
        children.add(body);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);        
    }
    
}
