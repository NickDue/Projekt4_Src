package AST;

import AST.visitors.IVisitor;

public class ProgramNode extends ASTNode {

    public ProgramNode(ASTNode parentNode) {
        super(null);
    }

    public ProgramNode(ASTNode parentNode, ASTNode declarations, ASTNode statements) {
        this(parentNode);
        children.add(declarations);
        children.add(statements);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
