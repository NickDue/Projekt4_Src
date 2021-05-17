package AST;

import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.VoidTypeDescriptor;

public class VoidTypeNode extends TypeNodesNode{

    public VoidTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "void";
        type = new VoidTypeDescriptor();
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
