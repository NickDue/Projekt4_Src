package SymbolTable.typeDescriptors;

public class CharacterTypeDescriptor extends TypeDescriptor {
    
    public CharacterTypeDescriptor() {
        super(TypeDescriptorKind.character);
            assignableTypes = new TypeDescriptorKind[] { TypeDescriptorKind.character};
        
    }
}