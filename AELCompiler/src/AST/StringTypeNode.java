package AST;

import SymbolTable.typeDescriptors.StringTypeDescriptor;

public class StringTypeNode extends TypeNodesNode {

    public StringTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "String";
        type = new StringTypeDescriptor();
    }
    
}
