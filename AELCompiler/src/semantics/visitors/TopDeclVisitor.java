package semantics.visitors;

import AST.ASTNode;
import AST.DeclarationNode;
import AST.IdentificationNode;
import SymbolTable.SymbolTable;
import SymbolTable.attributes.AttributeKind;
import SymbolTable.attributes.VariableAttributes;
import SymbolTable.typeDescriptors.ErrorTypeDescriptor;

public class TopDeclVisitor extends SemanticsVisitor{

    public TopDeclVisitor(SymbolTable symT) {
        super(symT);
    }
    
    public void visit(DeclarationNode node) {
        String className = node.getClass().getSimpleName();
        if(className == "ObjectDeclarationNode"){
            IdentificationNode id = (IdentificationNode)node.children.get(1);
            ASTNode expression = node.children.get(2);

            expression.accept(new SemanticsVisitor(symTable));

            if(symTable.declaredLocally(id.name)) {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                        " variable "+ "'" + id.name + "'" + " already declared.", node);
                id.attributesRef =  null;
            } else {
                VariableAttributes attr = new VariableAttributes();
                attr.kind = AttributeKind.variableAttributes;                // What type
                attr.variableType = expression.type;                         // Set type in attributes
                id.attributesRef = attr;                                     // Link attributes to node
                symTable.enterSymbol(id.name, attr);                      // Define in symbol table
            }
        } else if (className == "VariableDeclartionNode"){
            IdentificationNode id = (IdentificationNode)node.children.get(0);
            ASTNode literal = node.children.get(2);

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
        } 
    }
}