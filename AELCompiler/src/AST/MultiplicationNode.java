package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class MultiplicationNode extends BinaryExpressionNode implements IAccept {

    public MultiplicationNode(ASTNode parentNode) {
        super(parentNode);
    }

    public MultiplicationNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
        this.operator = "*";
    }
    
    public void accept(IVisitor visitor) {
        visitor.visit(this);
   }
}
