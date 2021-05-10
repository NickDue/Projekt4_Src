package SymbolTable.typeDescriptors;

public abstract class ArrayTypeDescriptor extends TypeDescriptor {

    public ArrayTypeDescriptor(TypeDescriptorKind kind){
        super(kind);
    }

    public ArrayTypeDescriptor(TypeDescriptorKind kind, TypeDescriptorKind elementType){
        super(kind);
    }

    public abstract TypeDescriptor getResultType(TypeDescriptor type, String operator);
}