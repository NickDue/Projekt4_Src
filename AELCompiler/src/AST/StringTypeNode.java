package AST;

import SymbolTable.typeDescriptors.StringTypeDescriptor;

public class StringTypeNode extends TypeNodesNode {

    public StringTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "char[]";
        type = new StringTypeDescriptor();
    }
    
}
