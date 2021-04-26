package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class AppendStringNode extends ASTNode implements IAccept {

    public AppendStringNode(ASTNode parentNode) {
        super(parentNode);
    }

    public AppendStringNode(ASTNode parentNode, ASTNode value, ASTNode nextValue){
        this(parentNode);
        children.add(value);
        children.add(nextValue);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);        
    }

    
}
