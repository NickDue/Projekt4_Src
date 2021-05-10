package semantics.visitors;

import java.util.ArrayList;

import AST.*;
import SymbolTable.typeDescriptors.ErrorTypeDescriptor;
import SymbolTable.typeDescriptors.TypeDescriptorKind;
import semantics.NodeVisitor;

public class ErrorVisitor extends NodeVisitor {

    public ArrayList<String> errors = new ArrayList<>();

    @Override
    public void visit(AssignmentNode node) {
        GenericPrint(node);
    }


    @Override
    public void visit(CodeBlockNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ErrorNode node) {
        GenericPrint(node);
    }


    @Override
    public void visit(IdentificationNode node) {
        GenericPrint(node);
    }


    @Override
    public void visit(ProgramNode node) {
        GenericPrint(node);
    }


    @Override
    public void visit(SubscriptingNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ValueIndexNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ObjectDeclarationNode node) {
        GenericPrint(node);
    }


    @Override
    public void visit(FunctionDeclarationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(FunctionParamsNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(TypeNodesNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(FunctionBodyNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(VariableDeclarationNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(AssignExpressionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ObjIdNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ArrayNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ArrayValueNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(StringLiteralNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(BooleanValueNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ExpressionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(TermNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(NumberNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(FunctionCallNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(ActualParamsNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(StatementNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(PrintNode node) {
        GenericPrint(node);
    }

    @Override
    public void visit(LogicalExpressionNode node) {
        GenericPrint(node);
    }




    @Override
    public void visit(AdditionExpressionNode node) {
        GenericPrint(node);
        
    }


    @Override
    public void visit(WhileNode node) {
        GenericPrint(node);
    }


    @Override
    public void visit(DivisionExpressionNode node) {
        GenericPrint(node);
    }


    @Override
    public void visit(ElseIfStmtNode node) {
        GenericPrint(node);
    }


    @Override
    public void visit(IfStmtNode node) {
        GenericPrint(node);
    }

    private void GenericPrint(ASTNode node) {
        if(node.type != null && node.type.kind == TypeDescriptorKind.error) {
            saveError((ErrorTypeDescriptor) node.type);
        } else {
            visitChildren(node);
        }
    }

    private boolean hasError(ASTNode node) {
        return node.type != null && node.type.kind == TypeDescriptorKind.error;
    }

    public void printErrors(){
        for (String message : errors) {
            System.out.println(message);
        }
    }

    public boolean hasErrors() {
        return errors.size() != 0;
    }

    private void saveError(ErrorTypeDescriptor error) {
        errors.add(error.errorMsg);
    }
}