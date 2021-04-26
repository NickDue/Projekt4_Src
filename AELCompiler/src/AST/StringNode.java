package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class StringNode extends ASTNode implements IAccept {

    public String string;

    public StringNode(ASTNode parentNode, String str) {
        super(parentNode);
        string = str;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
