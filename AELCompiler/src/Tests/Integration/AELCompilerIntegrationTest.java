package Tests.Integration;

import java.util.Hashtable;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import AST.ASTNode;
import AST.CodeBlockNode;
import AST.IdentificationNode;
import AST.IntLiteralNode;
import AST.ObjectDeclarationNode;
import AST.ProgramNode;
import compiler.AELCompiler;
import compiler.AELCompiler.CompilerArgs;

public class AELCompilerIntegrationTest{
    

    @Test
    @DisplayName("ParseArg: Path parsed correctly in hashtable")
    public void ParseArgsParsesCorrectly(){
        String args[] = {"C:/Users/meerq/OneDrive/Skrivebord/Projekt4_Src/test1.ael", "tester"};
        Hashtable<CompilerArgs, String> expected = new Hashtable<>(){
            {
                put(CompilerArgs.inputFile,"C:\\Users\\meerq\\OneDrive\\Skrivebord\\Projekt4_Src\\test1.ael");
                put(CompilerArgs.outputFile,"tester");
            }
        };
        AELCompiler compiler = new AELCompiler();
        
 
        Hashtable<CompilerArgs, String> result = new Hashtable<>();
        

        result = compiler.TestParseArgs(args);

        Assertions.assertEquals(expected, result);        

    }

    @Test
    @DisplayName("Analyze code correctly")
    public void AnlyzecodeTest(){
        String path = "C:/Users/meerq/OneDrive/Skrivebord/Projekt4_Src/test1.ael";
        AELCompiler compiler = new AELCompiler();
        
        ASTNode expected = new ProgramNode(null);
        CodeBlockNode blockNode = new CodeBlockNode(expected);
        expected.children.add(blockNode);
        ObjectDeclarationNode declNode = new ObjectDeclarationNode(blockNode);
        blockNode.children.add(declNode);
        IdentificationNode idNode = new IdentificationNode(declNode, "led");
        IntLiteralNode litNode = new IntLiteralNode(declNode, 1);
        declNode.children.add(idNode);
        declNode.children.add(litNode);
        declNode.objId = "OUTPUT";
        declNode.pinNumber = 1;

        ASTNode node = compiler.TestAnalyseCode(path);

        ObjectDeclarationNode exNode1 = (ObjectDeclarationNode) node.children.get(0).children.get(0);

        Assertions.assertEquals(expected.getClass(), node.getClass());
        Assertions.assertEquals(blockNode.getClass(), node.children.get(0).getClass());
        Assertions.assertEquals(declNode.getClass(), exNode1.getClass());
        Assertions.assertEquals(idNode.getClass(), exNode1.children.get(0).getClass());
        Assertions.assertEquals(litNode.getClass(), exNode1.children.get(1).getClass());
        Assertions.assertEquals("OUTPUT", exNode1.objId);
        Assertions.assertEquals(1, exNode1.pinNumber);
    }



}