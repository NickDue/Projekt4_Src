package Tests.Unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import AST.ASTNode;
import AST.ErrorNode;
import AST.ObjectDeclarationNode;
import AST.TypeNodesNode;
import compiler.ASLBuilderVisitor;
import CodeGeneration.CodeGenVisitor;


public class CodeGenVisitorUnitTest{

    CodeGenVisitor codeGen;

    @BeforeEach
    public void setup(){
    codeGen = new CodeGenVisitor(null);
    }

    @Test
    @DisplayName("test declared object")
    public void visit_ObjectDeclarationNode(){
        String expected = "pinMode(5, OUTPUT);";
        ObjectDeclarationNode node = new ObjectDeclarationNode(null);
        node.objId = "OUTPUT";
        node.pinNumber = 5;

        codeGen.visit(node);

        String actualResult = codeGen.getCurrentString();

        Assertions.assertEquals(expected, actualResult);


    }

    @Test
    @DisplayName("test declared object 2")
    public void visit_ObjectDeclarationNodeFalse(){
        String expected = "pinMode(5, INPUT);";
        ObjectDeclarationNode node = new ObjectDeclarationNode(null);
        node.objId = "OUTPUT";
        node.pinNumber = 5;

        codeGen.visit(node);

        String actualResult = codeGen.getCurrentString();

        Assertions.assertNotEquals(expected, actualResult);


    }

}
