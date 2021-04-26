package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class DoWhileNode extends StatementNode implements IAccept {

    public DoWhileNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DoWhileNode(ASTNode parentNode, ASTNode condition, ASTNode statements) {
        this(parentNode);
        children.add(condition);
        children.add(statements);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
