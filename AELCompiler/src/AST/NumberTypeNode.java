package AST;

public class NumberTypeNode extends TypeNodesNode {

    public NumberTypeNode(ASTNode parentNode) {
        super(parentNode);
        this.typeName = "float";
    }
    
}
