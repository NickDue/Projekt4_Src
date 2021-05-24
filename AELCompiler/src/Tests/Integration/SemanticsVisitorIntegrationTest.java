package Tests.Integration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import AST.CodeBlockNode;
import AST.FunctionDeclarationNode;
import AST.FunctionParamsDeclNode;
import AST.FunctionParamsNode;
import AST.IdentificationNode;
import AST.IntLiteralNode;
import AST.ProgramNode;
import AST.StringTypeNode;
import SymbolTable.SymbolTable;
import SymbolTable.attributes.VariableAttributes;
import SymbolTable.typeDescriptors.StringTypeDescriptor;
import semantics.visitors.SemanticsVisitor;

public class SemanticsVisitorIntegrationTest{
    SymbolTable symTab = new SymbolTable();

    SemanticsVisitor semVisit = new SemanticsVisitor(symTab);

    ProgramNode progNode = new ProgramNode(null);

    CodeBlockNode codeBNode = new CodeBlockNode(progNode);

    FunctionDeclarationNode funcDeclNode = new FunctionDeclarationNode(codeBNode);

    FunctionParamsNode parentNode = new FunctionParamsNode(funcDeclNode);

    FunctionParamsDeclNode testnode = new FunctionParamsDeclNode(parentNode);

    StringTypeNode typeNode = new StringTypeNode(testnode);
    
    IdentificationNode idNode = new IdentificationNode(testnode);

    
    @Test
    public void TestingSemVisitorSymTableIntegrationTest(){
        progNode.children.add(codeBNode);
        
        codeBNode.children.add(funcDeclNode);
        funcDeclNode.children.add(parentNode);
        parentNode.children.add(testnode);
        testnode.children.add(typeNode);
        testnode.children.add(idNode);

        

        idNode.name = "test";
        idNode.type = new StringTypeDescriptor();

        idNode.attributesRef = new VariableAttributes();

        idNode.attributesRef.depth = 1;
        idNode.attributesRef.formalParamsCount = 1;

        semVisit.visit(testnode);

        if(symTab.declaredLocally("test")){        
            
            // Test if name is correct
            Assertions.assertEquals(symTab.retrieveSymbol("test").name, "test");
            Assertions.assertNotEquals(symTab.retrieveSymbol("test").name, "errorName");

            // Test if type is correct
            Assertions.assertEquals(symTab.retrieveSymbol("test").objectKind, new StringTypeNode(null));
            Assertions.assertNotEquals(symTab.retrieveSymbol("test").objectKind, new IntLiteralNode(null));

            // Test if depth is correct

            Assertions.assertEquals(symTab.retrieveSymbol("test").depth, 1);
            Assertions.assertNotEquals(symTab.retrieveSymbol("test").depth, 2);

            // Test if formal params count is correct

            Assertions.assertEquals(symTab.retrieveSymbol("test").formalParamsCount, 1);
            Assertions.assertNotEquals(symTab.retrieveSymbol("test").formalParamsCount, 5);


        }




    }

}