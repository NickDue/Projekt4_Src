package SymbolTable.typeDescriptors;

public class BooleanTypeDescriptor extends TypeDescriptor {
    
    public BooleanTypeDescriptor() {
        super(TypeDescriptorKind.bool);
        assignableTypes = new TypeDescriptorKind[] { TypeDescriptorKind.bool};
    }
}