package AST;

import AST.visitors.IVisitor;

public class MultiplicationExpressionNode extends BinaryExpressionNode {

    public MultiplicationExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public MultiplicationExpressionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
        this.operator = "*";
    }


    public void accept(IVisitor visitor) {
         visitor.visit(this);
    }
    
}
