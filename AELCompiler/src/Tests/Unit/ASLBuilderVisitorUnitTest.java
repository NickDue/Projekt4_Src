package Tests.Unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import AST.ASTNode;
import AST.ErrorNode;
import AST.FunctionDeclarationNode;
import AST.TypeNodesNode;
import compiler.ASLBuilderVisitor;


public class ASLBuilderVisitorUnitTest {

    ASLBuilderVisitor builder;
    
    @BeforeEach
    public void setup(){
        builder = new ASLBuilderVisitor();
    }

    @Test
    @DisplayName("VisitType: Generates NodeType Number")
   public void VisitType_NodeTypeNumber(){ 

       FunctionDeclarationNode parentNode = new FunctionDeclarationNode(null);
       TypeNodesNode Node = (TypeNodesNode) builder.visitType("number", parentNode, false);

       Assertions.assertEquals("float", Node.typeName);
   }
    @Test
    @DisplayName("VisitType: Generates NodeType String")
   public void VisitType_NodeTypeString(){ 
       
       FunctionDeclarationNode parentNode = new FunctionDeclarationNode(null);
       TypeNodesNode Node = (TypeNodesNode) builder.visitType("string", parentNode, false);

       Assertions.assertEquals("char[]", Node.typeName);
   }
   @Test
    @DisplayName("VisitType: Generates NodeType Bool")
   public void VisitType_NodeTypeBool(){ 
      
       FunctionDeclarationNode parentNode = new FunctionDeclarationNode(null);
       TypeNodesNode Node = (TypeNodesNode) builder.visitType("bool", parentNode, false);

       Assertions.assertEquals("bool", Node.typeName);
   }
   @Test
    @DisplayName("VisitType: Generates NodeType Char")
   public void VisitType_NodeTypeChar(){ 
       
       FunctionDeclarationNode parentNode = new FunctionDeclarationNode(null);
       TypeNodesNode Node = (TypeNodesNode) builder.visitType("char", parentNode, false);

       Assertions.assertEquals("char", Node.typeName);
   }

   @Test
    @DisplayName("VisitType: Generates ErrorNode when void used a paramters")
   public void VisitType_NodeTypeVoidAsParameter(){ 
       
       FunctionDeclarationNode parentNode = new FunctionDeclarationNode(null);
       ASTNode Node = builder.visitType("void", parentNode, true);
       ASTNode error = new ErrorNode(parentNode, "Error");

       Assertions.assertEquals(error.type.kind, Node.type.kind);
       
   }

   @Test
    @DisplayName("VisitType: Generates VoidNode")
   public void VisitType_NodeTypeVoid(){ 
       
       FunctionDeclarationNode parentNode = new FunctionDeclarationNode(null);
       TypeNodesNode Node = (TypeNodesNode) builder.visitType("void", parentNode, false);
       Assertions.assertEquals("void", Node.typeName);
   }

    @Test
    @DisplayName("VisitType: Generates ErrorNode for unknown type")
   public void VisitType_NodeTypeUnknown(){ 
       
       FunctionDeclarationNode parentNode = new FunctionDeclarationNode(null);
       ASTNode error = new ErrorNode(null, "Error");
       ASTNode Node = builder.visitType("FooBar", parentNode, false);
       
       Assertions.assertEquals(error.type.kind, Node.type.kind);
   }

   @Test
    @DisplayName("VisitType: Catches Type null reference ")
   public void VisitType_TypeNullException(){ 

       FunctionDeclarationNode parentNode = new FunctionDeclarationNode(null);

       Assertions.assertThrows(RuntimeException.class, () -> {
           TypeNodesNode Node = (TypeNodesNode) builder.visitType(null, parentNode, false);
       });
   }


}