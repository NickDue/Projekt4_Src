package AST;

import AST.visitors.IVisitor;

public class CodeBlockNode extends ASTNode {

    public CodeBlockNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
