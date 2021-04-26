package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class WhileNode extends StatementNode implements IAccept {

    public WhileNode(ASTNode parentNode) {
        super(parentNode);
    }

    public WhileNode(ASTNode parentNode, ASTNode condition, ASTNode statements) {
        this(parentNode);
        children.add(condition);
        children.add(statements);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
        
    }
    
}
