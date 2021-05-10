package SymbolTable.typeDescriptors;

public class NumberTypeDescriptor extends TypeDescriptor{

    public NumberTypeDescriptor() {
        super(TypeDescriptorKind.number);
        assignableTypes = new TypeDescriptorKind[] {TypeDescriptorKind.number};
    }

    @Override
    public boolean canCalculate(TypeDescriptor type, String operator) {
        if(type.kind == TypeDescriptorKind.number){
            return true;
        } return false;
    }

    @Override
    public TypeDescriptor getResultType(TypeDescriptor type, String operator){
        if(canCalculate(type, operator)){
            if(type.kind == TypeDescriptorKind.number){
                return this;
            } 
        }

        return null;
    }
    
}
