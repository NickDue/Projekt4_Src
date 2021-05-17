package semantics.visitors;

import AST.ASTNode;
import AST.FunctionDeclarationNode;
import AST.IdentificationNode;
import AST.ObjectDeclarationNode;
import AST.VariableDeclarationNode;
import SymbolTable.SymbolTable;
import SymbolTable.attributes.AttributeKind;
import SymbolTable.attributes.ObjectKind;
import SymbolTable.attributes.VariableAttributes;
import SymbolTable.typeDescriptors.ErrorTypeDescriptor;

public class TopDeclVisitor extends SemanticsVisitor{

    public TopDeclVisitor(SymbolTable symT) {
        super(symT);
    }
    
    public void visit(VariableDeclarationNode node) {
        IdentificationNode id = (IdentificationNode)node.children.get(1);
        ASTNode literal = node.children.get(2);

        if(node.children.size() == 1){ //array
            ASTNode array = node.children.get(0);
            id = (IdentificationNode)array.children.get(1);

            literal.accept(new SemanticsVisitor(symTable));

            if(symTable.declaredLocally(id.name)) {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                        " variable "+ "'" + id.name + "'" + " already declared.", node);
                id.attributesRef =  null;
            } else {
                VariableAttributes attr = new VariableAttributes();
                attr.kind = AttributeKind.variableAttributes;                // What type
                attr.variableType = literal.type;                         // Set type in attributes
                id.attributesRef = attr;                                     // Link attributes to node
                symTable.enterSymbol(id.name, attr); 
            }

        } else if (node.children.size() > 1 ){ //normal
            literal.accept(new SemanticsVisitor(symTable));

            if(symTable.declaredLocally(id.name)) {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                        " variable "+ "'" + id.name + "'" + " already declared.", node);
                id.attributesRef =  null;
            } else {
                VariableAttributes attr = new VariableAttributes();
                attr.kind = AttributeKind.variableAttributes;                // What type
                attr.variableType = literal.type;                         // Set type in attributes
                id.attributesRef = attr;                                     // Link attributes to node
                symTable.enterSymbol(id.name, attr);                      // Define in symbol table
            }
        } else {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                    " variable "+ "'" + id.name + "'" + " already declared.", node);
            id.attributesRef =  null;
        }
    }

    public void visit(FunctionDeclarationNode node){
        IdentificationNode id = (IdentificationNode)node.children.get(1);
        ASTNode expression = node.children.get(0);
        int formalParamsCount = 0;
        if(node.children.size() > 2){
            formalParamsCount = node.children.get(2).children.size();
        }
        

        expression.accept(new SemanticsVisitor(symTable));

        if(symTable.declaredLocally(id.name)) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                    " variable "+ "'" + id.name + "'" + " already declared.", node);
            id.attributesRef =  null;
        } else {
            VariableAttributes attr = new VariableAttributes();
            attr.kind = AttributeKind.variableAttributes;                // What type
            attr.variableType = expression.type;    
            if(node.children.size() > 2)                    // Set type in attributes
                attr.formalParamsCount = formalParamsCount;                 // Add number of formal params to attributes
            id.attributesRef = attr;                                     // Link attributes to node
            symTable.enterSymbol(id.name, attr);                         // Define in symbol table

            
        }
    }

    public void visit(ObjectDeclarationNode node){
        /* lampe = LED(1) */
            IdentificationNode id = (IdentificationNode)node.children.get(0);
            ASTNode expression = node.children.get(1);
            String name = node.getClass().getSimpleName();

            expression.accept(new SemanticsVisitor(symTable));

            if(symTable.declaredLocally(id.name)) {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                        " variable "+ "'" + id.name + "'" + " already declared.", node);
                id.attributesRef =  null;
            } else {
                VariableAttributes attr = new VariableAttributes();
                attr.pinNumber = node.pinNumber;
                if(name.equalsIgnoreCase("LedNote")){
                    attr.objectKind = ObjectKind.led;
                } else if(name.equalsIgnoreCase("ButtonNode")){
                    attr.objectKind = ObjectKind.button;
                }
                attr.kind = AttributeKind.variableAttributes;                // What type
                attr.variableType = expression.type;                         // Set type in attributes
                id.attributesRef = attr;                                     // Link attributes to node
                symTable.enterSymbol(id.name, attr);                         // Define in symbol table
            }
        
    }
}