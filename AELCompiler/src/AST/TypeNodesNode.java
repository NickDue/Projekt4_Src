package AST;

import AST.visitors.IVisitor;

public class TypeNodesNode extends ASTNode {
    public String typeName;

    public TypeNodesNode(ASTNode parentNode) {
        super(parentNode);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
