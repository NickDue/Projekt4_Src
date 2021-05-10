package AST;

import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.NumberTypeDescriptor;

public class IntLiteralNode extends ASTNode{

    public int value;

    public IntLiteralNode(ASTNode parentNode) {
        super(parentNode);
        type = new NumberTypeDescriptor();
    }

    public IntLiteralNode(ASTNode parent, int val){
        this(parent);
        this.value = val;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
