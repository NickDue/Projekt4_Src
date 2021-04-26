package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class DivisionNode extends BinaryExpressionNode implements IAccept {

    public DivisionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DivisionNode(ASTNode parentNode, ASTNode leftOp, ASTNode rightOp){
        this(parentNode);
        children.add(leftOp);
        children.add(rightOp);
        this.operator = "/";
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
    
}
