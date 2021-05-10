package AST;

import SymbolTable.typeDescriptors.NumberTypeDescriptor;

public class FloatLiteralNode extends NumberNode {

    public float value;

    public FloatLiteralNode(ASTNode parentNode) {
        super(parentNode);
        type = new NumberTypeDescriptor();
    }

    public FloatLiteralNode(ASTNode parentNode, float val){
        this(parentNode);
        value = val;
    }
    
}
