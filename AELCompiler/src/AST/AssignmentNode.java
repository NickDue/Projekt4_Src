package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class AssignmentNode extends ASTNode implements IAccept {
    
    public AssignmentNode(ASTNode parentNode){
        super(parentNode);
        terminatesNormally = true;
    }

    public AssignmentNode(ASTNode parentNode, String id){
        this(parentNode);
        this.children.add(new IdentificationNode(this, id));
    }

    public AssignmentNode(ASTNode parent, String id, String valIndex){
        this(parent);
        this.children.add(new IdentificationNode(this, id));
        this.children.add(new SubscriptingNode(this, valIndex));
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }


}