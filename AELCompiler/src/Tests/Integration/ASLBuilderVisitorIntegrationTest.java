import ANTLR.AELBaseVisitor;
import ANTLR.AELParser;
import ANTLR.AELParser.*;
import AST.*;


public class ASLBuilderVisitorIntegrationTest {
    ASTNode node = new ASTNode();
    ASTNode childNode1 = new ASTNode(node)
    ASTNode childNode2 = new ASTNode(node)
    
    node.children.add(childNode1);
    node.children.add(childNode2);

    node.varDecl();

    

    
}