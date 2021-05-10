package SymbolTable.typeDescriptors;

public class VoidTypeDescriptor extends TypeDescriptor {
    
    public VoidTypeDescriptor() {
        super(TypeDescriptorKind.voidd);
        assignableTypes = new TypeDescriptorKind[] { TypeDescriptorKind.voidd};
    }
}