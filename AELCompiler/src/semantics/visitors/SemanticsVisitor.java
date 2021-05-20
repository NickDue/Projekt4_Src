package semantics.visitors;

import AST.*;
import semantics.NodeVisitor;
import SymbolTable.SymbolTable;
import SymbolTable.attributes.AttributeKind;
import SymbolTable.attributes.VariableAttributes;
import SymbolTable.typeDescriptors.*;

public class SemanticsVisitor extends NodeVisitor  {
    SymbolTable symTable;

    public SemanticsVisitor(SymbolTable symT) {
        symTable = symT;
    }
    
    public void checkBoolean(ASTNode node, int node0, int node1) {
        if(node.children.get(node0).type.kind != node.children.get(node1).type.kind){
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                        "conditions are not of the same type", node);
        }
    }


    @Override
    public void visit(CodeBlockNode node) {
        symTable.openScope();
        visitChildren(node);
        symTable.closeScope();
    }

    @Override
    public void visit(ErrorNode node) {
        /* Nothing to do here*/
    }


    @Override
    public void visit(IdentificationNode node) {
        VariableAttributes attrRef = (VariableAttributes)symTable.retrieveSymbol(node.name);
        if(attrRef == null) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                    " variable " + "'" + node.name + "'" + " has not been declared", node);
            node.attributesRef = null;
        } else {
            // Symbol-table reference and variable-type to node
            node.attributesRef = attrRef;
            node.type = attrRef.variableType;      // TODO: More checking. Maybe. Page 327
        }
        
    }


    @Override
    public void visit(ProgramNode node) {
        node.isReachable = true;
        node.children.get(0).isReachable = true;
        visitChildren(node);
    }



    @Override
    public void visit(ObjectDeclarationNode node) {
        node.accept(new TopDeclVisitor(symTable));
    }


    @Override
    public void visit(FunctionDeclarationNode node) {
        node.accept(new TopDeclVisitor(symTable));
    }

    @Override
    public void visit(FunctionParamsNode node) {
        visitChildren(node);
    }
    

    /* number a, string e, bool kl */
    @Override
    public void visit(FunctionParamsDeclNode node) {
        ASTNode exp = node.children.get(0);
        IdentificationNode id = (IdentificationNode)node.children.get(1);
        if(node.children.size() != 2){
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ","
                 + "is either missing a type or an id!", node);
        } else {
            VariableAttributes attr = new VariableAttributes();
            attr.kind = AttributeKind.variableAttributes;         
            attr.variableType = exp.type;                         
            id.attributesRef = attr;                              
            symTable.enterSymbol(id.name, attr);
        }
    }

    @Override
    public void visit(TypeNodesNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(FunctionBodyNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(VariableDeclarationNode node) {
        visit((DeclarationNode) node);
    }

    @Override
    public void visit(AssignExpressionNode node) {
        IdentificationNode id = (IdentificationNode)node.children.get(0);
        ASTNode expression = node.children.get(1);

        // Do Semantic-analysis on children
        visitChildren(node);

        // Check if the expression can be assigned to th variable
        if(id.type.kind == TypeDescriptorKind.error || expression.type.kind == TypeDescriptorKind.error) {
            // If the children already contain errors don't add another one. They are more specific.
        } else if(id.type.isAssignable(expression.type)) {
            ((VariableAttributes)id.attributesRef).variableType = expression.type;
            node.type = expression.type;
        } else {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," +  "'" +
                    id.name + "'" + " cannot be assigned value of type " + "'" +
                    expression.type.kind.toString() + "'", node);
        }
    }

    @Override
    public void visit(ObjIdNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(ArrayNode node) {
        node.accept(new TopDeclVisitor(symTable));

        visitChildren(node);
    }

    @Override
    public void visit(ArrayValueNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(StringLiteralNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(BooleanValueNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(ExpressionNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(TermNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(NumberNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(FunctionCallNode node) {
        if(node.children.get(0) != null){
            String name = node.children.getClass().getSimpleName();
            if(symTable.retrieveSymbol(name) != null){
                if(node.children.get(2).children.size() != symTable.retrieveSymbol(name).formalParamsCount){
                    node.type = new ErrorTypeDescriptor("at line" + node.lineNumber + ":" + node.charPosition + "," + "number of actual parameters does not match the formal parameters");
                }
            }
            
        }
        
        visitChildren(node);

        //check om id ligger i symbol table
        //check om størrelsen af dens børn er ens
        //check hvert børns type

    }

    @Override
    public void visit(ActualParamsNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        ASTNode leftOperand = node.children.get(0);
        ASTNode rightOperand = node.children.get(1);

        // Do semantic-analysis on children
        visitChildren(node);

        // Check if operands can perform the specified operation
        if(leftOperand.type instanceof ErrorTypeDescriptor || rightOperand.type instanceof ErrorTypeDescriptor) {
            // Already contains more specific error
        } else if(!leftOperand.type.canCalculate(rightOperand.type, node.operator)) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + "," + 
                    " incompatible types for '" + node.operator + "' operator", node);
        } else {
            // Calculate new type as type info might change when performing the specified operation
            node.type = leftOperand.type.getResultType(rightOperand.type, node.operator);
        }
    }

    @Override
    public void visit(StatementNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(PrintNode node) {
         // Do semantic-analysis of children
         visitChildren(node);

         // Check if references return a number as other types are not printable (yet)
         for (ASTNode child : node.children) { 
            if(child.type.kind != TypeDescriptorKind.number) {
                if(child.type.kind == TypeDescriptorKind.error) {
                    // If the children already contain errors don't add another one. They are more specific.
                } else {
                    child.type = new ErrorTypeDescriptor("at line " + child.lineNumber + ":" + child.charPosition +
                        "," + "'" + ((IdentificationNode)child.children.get(0)).name + " ' is not of printable type");
                }
            }
        }
         
    }

    @Override
    public void visit(LogicalExpressionNode node) {
        visitChildren(node);
        checkBoolean(node, 0, 1);
    }

    public void visit(AdditionExpressionNode node) {
        visit((BinaryExpressionNode)node);
    }

    @Override
    public void visit(WhileNode node) {
       // Do semantic-analysis of children
       visitChildren(node);

       // Confirm that the specified condition is indeed a boolean-expression
       checkBoolean(node.children.get(0), 0 ,1);
    }

    @Override
    public void visitChildren(ASTNode node) {
        // Iterate through all children except the one with errors
        if(node.children.size() != 0) {
            for ( ASTNode child : node.children ) {
                if(!(child.type instanceof ErrorTypeDescriptor)) { // If it has no type, it is not an errorNode.
                    child.accept(this);
                }
            }
        }
    }

    @Override
    public void visit(DivisionExpressionNode node) {
        visit((BinaryExpressionNode)node);
    }

    @Override
    public void visit(ElseIfStmtNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(IfStmtNode node) {
        // Do semantic-analysis of children
        visitChildren(node);
    }

    @Override
    public void visit(DeclarationNode node) {
        node.accept(new TopDeclVisitor(symTable));
    }

    @Override
    public void visit(IntLiteralNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(ElseStmtNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(MultiplicationExpressionNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(FloatLiteralNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(DoWhileNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(LoopStmtNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(WhenNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(WaitNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(ReturnNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(ObjFuncallStmtNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(TimeNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(CaseNode node) {
        visitChildren(node);
    }

    @Override
    public void visit(DefaultNode node) {
        visitChildren(node);
    }



    

}






