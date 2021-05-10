package AST;

import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.BooleanTypeDescriptor;

public class BooleanValueNode extends ASTNode{

    public boolean value;

    public BooleanValueNode(ASTNode parentNode) {
        super(parentNode);
        type = new BooleanTypeDescriptor();
    }

    public BooleanValueNode(ASTNode parent, boolean value){
        this(parent);
        this.value = value;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
