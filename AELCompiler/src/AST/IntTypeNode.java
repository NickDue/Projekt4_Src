package AST;

import SymbolTable.typeDescriptors.NumberTypeDescriptor;

public class IntTypeNode extends TypeNodesNode {

    public IntTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "int";
        type = new NumberTypeDescriptor();
    }
    
}
