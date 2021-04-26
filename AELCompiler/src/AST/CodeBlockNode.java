package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class CodeBlockNode extends ASTNode implements IAccept {

    public CodeBlockNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
