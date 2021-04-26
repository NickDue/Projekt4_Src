package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class ValueIndexNode extends ASTNode implements IAccept {

    public String id;
    public int indexA = -1;
    public int indexB = -1;

    public ValueIndexNode(ASTNode parentNode) {
        super(parentNode);
    }

    public ValueIndexNode(ASTNode parentNode, int a) {
        this(parentNode);
        indexA = a;
    }

    public ValueIndexNode(ASTNode parentNode, int a, int b) {
        this(parentNode, a);
        indexB = b;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
        
    }
    
}
