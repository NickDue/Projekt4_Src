package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class IfStatementNode extends StatementNode implements IAccept {

    public IfStatementNode(ASTNode parentNode) {
        super(parentNode);
    }

    public IfStatementNode(ASTNode parentNode, ASTNode condition, ASTNode statements) {
        this(parentNode);
        children.add(condition);
        children.add(statements);
    }

    public IfStatementNode(ASTNode parentNode, ASTNode condition, ASTNode statements, ASTNode ElseStatement) {
        this(parentNode, condition, statements);
        children.add(ElseStatement);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
        
    }
    
}
