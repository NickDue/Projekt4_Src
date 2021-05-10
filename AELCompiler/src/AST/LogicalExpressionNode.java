package AST;

import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.BooleanTypeDescriptor;

public class LogicalExpressionNode extends ASTNode{
    public String operator;

    public LogicalExpressionNode(ASTNode parentNode) {
        super(parentNode);
    }

    public LogicalExpressionNode(ASTNode parentNode, ASTNode leftOperand, ASTNode rightOperands) {
        this(parentNode);
        children.add(leftOperand);
        children.add(rightOperands);
        type = new BooleanTypeDescriptor();
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
