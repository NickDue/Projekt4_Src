package AST.visitors;



import AST.ActualParamsNode;
import AST.AdditionExpressionNode;
import AST.ArrayNode;
import AST.ArrayValueNode;
import AST.AssignExpressionNode;
import AST.AssignmentNode;
import AST.BinaryExpressionNode;
import AST.BooleanValueNode;
import AST.CodeBlockNode;
import AST.DivisionExpressionNode;
import AST.ElseIfStmtNode;
import AST.ErrorNode;
import AST.ExpressionNode;
import AST.FunctionBodyNode;
import AST.FunctionCallNode;
import AST.FunctionDeclarationNode;
import AST.FunctionParamsNode;
import AST.IdentificationNode;
import AST.IfStmtNode;
import AST.LogicalExpressionNode;
import AST.NumberNode;
import AST.ObjIdNode;
import AST.ObjectDeclarationNode;
import AST.PrintNode;
import AST.ProgramNode;
import AST.StatementNode;
import AST.StringLiteralNode;
import AST.SubscriptingNode;
import AST.TermNode;
import AST.TypeNodesNode;
import AST.ValueIndexNode;
import AST.VariableDeclarationNode;
import AST.WhileNode;

public interface IVisitor {

    void visit(AssignmentNode node);

    void visit(CodeBlockNode node);

    void visit(ErrorNode node);

    void visit(IdentificationNode node);

    void visit(ProgramNode node);

    void visit(SubscriptingNode node);

    void visit(ValueIndexNode node);

    void visit(ObjectDeclarationNode node);

    void visit(FunctionDeclarationNode node);

    void visit(FunctionParamsNode node);

    void visit(TypeNodesNode node);

    void visit(FunctionBodyNode node);

    void visit(VariableDeclarationNode node);
    
    void visit(AssignExpressionNode node);

    void visit(ObjIdNode note);

    void visit(ArrayNode node);

    void visit(ArrayValueNode node);

    void visit(StringLiteralNode node);

    void visit(BooleanValueNode node);

    void visit(ExpressionNode node);

    void visit(TermNode node);

    void visit(NumberNode node);

    void visit(FunctionCallNode node);

    void visit(ActualParamsNode node);

    void visit(BinaryExpressionNode node);

    void visit(StatementNode node);

    void visit(PrintNode node);

    void visit(LogicalExpressionNode node);

    void visit(AdditionExpressionNode node);

    void visit(WhileNode node);

    void visit(DivisionExpressionNode node);

    void visit(ElseIfStmtNode node);

    void visit(IfStmtNode node);
    
}
