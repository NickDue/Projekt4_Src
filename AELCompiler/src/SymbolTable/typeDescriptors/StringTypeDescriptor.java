package SymbolTable.typeDescriptors;

public class StringTypeDescriptor extends TypeDescriptor {
    
    public StringTypeDescriptor() {
        super(TypeDescriptorKind.string);
        assignableTypes = new TypeDescriptorKind[] { TypeDescriptorKind.string};
    }
}