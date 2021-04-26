package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class PrintNode extends ASTNode implements IAccept {

    public PrintNode(ASTNode parentNode) {
        super(parentNode);
    }

    public PrintNode(ASTNode parentNode, StringStatementNode string) {
        this(parentNode);
        children.add(string);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
        
    }
    
}
