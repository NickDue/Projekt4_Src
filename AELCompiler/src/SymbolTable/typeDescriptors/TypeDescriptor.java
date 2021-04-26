package SymbolTable.typeDescriptors;

public abstract class TypeDescriptor {
    public TypeDescriptorKind kind;
    public TypeDescriptorKind[] assignableTypes;

    public TypeDescriptor(TypeDescriptorKind kind){
        this.kind = kind;
    }

    public TypeDescriptor getResultType(TypeDescriptor type, String operator){
        return this;
    }

    public boolean canCalculate(TypeDescriptor type, String operator){
        return isAssignable(type);
    }

    public boolean isAssignable(TypeDescriptor type){
        return isAssignable(type.kind);
    }

    public boolean isAssignable(TypeDescriptorKind type) {
        for(int i = 0; i < assignableTypes.length; i++){
            if(assignableTypes[i] == type){
                return true;
            }
        }
        return false;
    }
}