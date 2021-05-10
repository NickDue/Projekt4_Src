package AST;

import AST.visitors.IVisitor;

public class SubtractionExpressionNode extends BinaryExpressionNode{

    public SubtractionExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public SubtractionExpressionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
        this.operator = "-";
    }


    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
