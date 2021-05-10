package SymbolTable.typeDescriptors;

import AST.*;

public class ErrorTypeDescriptor extends TypeDescriptor{

        public String errorMsg;
        public ASTNode reference;

    public ErrorTypeDescriptor(String msg) {
        super(TypeDescriptorKind.error);
        this.errorMsg = msg;
        assignableTypes = new TypeDescriptorKind[] {TypeDescriptorKind.error};
    }
    
    public ErrorTypeDescriptor(String msg, ASTNode ref) {
        this(msg);
        this.reference = ref;
    }
}
