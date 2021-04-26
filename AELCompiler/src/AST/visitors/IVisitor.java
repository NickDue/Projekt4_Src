package AST.visitors;

import AST.AdditionNode;
import AST.AppendStringNode;
import AST.AssignmentNode;
import AST.CodeBlockNode;
import AST.DeclarationNode;
import AST.DivisionNode;
import AST.DoWhileNode;
import AST.ElseStatementNode;
import AST.ErrorNode;
import AST.IdentificationNode;
import AST.IfStatementNode;
import AST.InitializationNode;
import AST.MultiplicationNode;
import AST.PrintNode;
import AST.ProgramNode;
import AST.ReferenceNode;
import AST.StringNode;
import AST.StringStatementNode;
import AST.SubscriptingAssignementNode;
import AST.SubscriptingNode;
import AST.SubtractionNode;
import AST.ValueIndexNode;
import AST.WhileNode;

public interface IVisitor {
    void visit(AdditionNode node);

    void visit(AssignmentNode node);

    void visit(DivisionNode node);

    void visit(MultiplicationNode node);

    void visit(SubtractionNode node);

    void visit(AppendStringNode node);

    void visit(CodeBlockNode node);

    void visit(ErrorNode node);

    void visit(SubscriptingAssignementNode node);

    void visit(IdentificationNode node);

    void visit(DeclarationNode node);

    void visit(ReferenceNode node);

    void visit(InitializationNode node);

    void visit(PrintNode node);

    void visit(StringStatementNode node);

    void visit(ProgramNode node);

    void visit(ElseStatementNode node);

    void visit(IfStatementNode node);

    void visit(WhileNode node);

    void visit(DoWhileNode node);

    void visit(StringNode node);

    void visit(SubscriptingNode node);

    void visit(ValueIndexNode node);
}
