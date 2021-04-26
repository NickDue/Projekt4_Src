package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;
//import SymbolTable.attributes.Attributes;

public class IdentificationNode extends ASTNode implements IAccept {
    public String name;
    //public Attributes attributesRef;

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
