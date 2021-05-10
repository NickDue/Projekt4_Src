package AST;

import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.StringTypeDescriptor;

public class StringLiteralNode extends ASTNode {

    public String str;

    public StringLiteralNode(ASTNode parentNode) {
        super(parentNode);
        type = new StringTypeDescriptor();
    }

    public StringLiteralNode(ASTNode parent, String value){
        this(parent);
        str = value;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
