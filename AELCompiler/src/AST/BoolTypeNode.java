package AST;

import SymbolTable.typeDescriptors.BooleanTypeDescriptor;

public class BoolTypeNode extends TypeNodesNode{

    public BoolTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "bool";
        type = new BooleanTypeDescriptor();
    }
    
}
