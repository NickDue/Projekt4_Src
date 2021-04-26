package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class SubtractionNode extends BinaryExpressionNode implements IAccept{

    public SubtractionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public SubtractionNode(ASTNode parentNode, ASTNode leftOp, ASTNode rightOp){
        this(parentNode);
        children.add(leftOp);
        children.add(rightOp);
        this.operator = "-";
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
   }
    
}
