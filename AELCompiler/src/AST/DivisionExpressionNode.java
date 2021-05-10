package AST;

import AST.visitors.IVisitor;

public class DivisionExpressionNode extends BinaryExpressionNode {

    public DivisionExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public DivisionExpressionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
        this.operator = "/";
    }


    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
