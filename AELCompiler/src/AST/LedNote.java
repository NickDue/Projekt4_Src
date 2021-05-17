package AST;

import SymbolTable.typeDescriptors.ObjectTypeDescriptor;
import SymbolTable.typeDescriptors.TypeDescriptorKind;

public class LedNote extends ObjIdNode {

    public LedNote(ASTNode parentNode) {
        super(parentNode);
        this.objType = "LED";
        type = new ObjectTypeDescriptor(TypeDescriptorKind.object);
    }
}
