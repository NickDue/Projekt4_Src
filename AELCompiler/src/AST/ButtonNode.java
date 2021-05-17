package AST;

import SymbolTable.typeDescriptors.ObjectTypeDescriptor;
import SymbolTable.typeDescriptors.TypeDescriptorKind;

public class ButtonNode extends ObjIdNode {

    public ButtonNode(ASTNode parentNode) {
        super(parentNode);
        this.objType = "BUTTON";
        type = new ObjectTypeDescriptor(TypeDescriptorKind.object);
    }

}
