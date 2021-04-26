package AST;

import AST.visitors.IAccept;
import AST.visitors.IVisitor;

public class AdditionNode extends BinaryExpressionNode implements IAccept{
    
    public AdditionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public AdditionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperand){
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperand);
        this.operator = "+";
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }
    
}
