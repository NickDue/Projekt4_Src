package AST;

import AST.visitors.IVisitor;
import SymbolTable.attributes.*;

public class IdentificationNode extends ASTNode {
    public String name;
    public Attributes attributesRef;

    public IdentificationNode(ASTNode parentNode) {
        super(parentNode);
    }

    public IdentificationNode(ASTNode parent, String name) {
        this(parent);
        this.name = name;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
