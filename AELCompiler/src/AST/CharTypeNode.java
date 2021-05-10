package AST;

import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.CharacterTypeDescriptor;

public class CharTypeNode extends TypeNodesNode {

    public CharTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "char";
        type = new CharacterTypeDescriptor();
    }
    
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
