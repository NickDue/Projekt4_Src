package AST.visitors;



import AST.ActualParamsNode;
import AST.AdditionExpressionNode;
import AST.ArrayNode;
import AST.ArrayValueNode;
import AST.AssignExpressionNode;
import AST.BinaryExpressionNode;
import AST.BooleanValueNode;
import AST.CaseNode;
import AST.CodeBlockNode;
import AST.DeclarationNode;
import AST.DefaultNode;
import AST.DivisionExpressionNode;
import AST.DoWhileNode;
import AST.ElseIfStmtNode;
import AST.ElseStmtNode;
import AST.ErrorNode;
import AST.ExpressionNode;
import AST.FloatLiteralNode;
import AST.FunctionBodyNode;
import AST.FunctionCallNode;
import AST.FunctionDeclarationNode;
import AST.FunctionParamsDeclNode;
import AST.FunctionParamsNode;
import AST.IdentificationNode;
import AST.IfStmtNode;
import AST.IntLiteralNode;
import AST.LogicalExpressionNode;
import AST.LoopStmtNode;
import AST.MultiplicationExpressionNode;
import AST.NumberNode;
import AST.ObjFuncallStmtNode;
import AST.ObjIdNode;
import AST.ObjectDeclarationNode;
import AST.PrintNode;
import AST.ProgramNode;
import AST.ReturnNode;
import AST.StatementNode;
import AST.StringLiteralNode;
import AST.TermNode;
import AST.TimeNode;
import AST.TypeNodesNode;
import AST.VariableDeclarationNode;
import AST.WaitNode;
import AST.WhenNode;
import AST.WhileNode;

public interface IVisitor {


    void visit(CodeBlockNode node);

    void visit(ErrorNode node);

    void visit(IdentificationNode node);

    void visit(ProgramNode node);


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

    void visit(DeclarationNode node);

    void visit(FunctionParamsDeclNode node);
    
    void visit(IntLiteralNode node);

    void visit(ElseStmtNode node);

    void visit(MultiplicationExpressionNode node);

    void visit(FloatLiteralNode node);

    void visit(DoWhileNode node);

    void visit(LoopStmtNode node);

    void visit(WhenNode node);

    void visit(WaitNode node);

    void visit(ReturnNode node);

    void visit(ObjFuncallStmtNode node);

    void visit(TimeNode node);

    void visit(CaseNode node);

    void visit(DefaultNode node);

}
