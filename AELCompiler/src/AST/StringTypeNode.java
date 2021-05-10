package AST;

import SymbolTable.typeDescriptors.StringTypeDescriptor;

public class StringTypeNode extends TypeNodesNode {

    public StringTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "string";
        type = new StringTypeDescriptor();
    }
    
}
