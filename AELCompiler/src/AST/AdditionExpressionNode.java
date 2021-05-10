package AST;

import AST.visitors.IVisitor;

public class AdditionExpressionNode extends BinaryExpressionNode{

    public AdditionExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public AdditionExpressionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
        this.operator = "+";
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
