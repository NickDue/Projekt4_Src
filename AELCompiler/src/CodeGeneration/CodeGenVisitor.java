package CodeGeneration;

import java.util.ArrayList;

import AST.*;
import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.TypeDescriptorKind;

public class CodeGenVisitor implements IVisitor {

    private CodeGenStringBuilder builder;
    private String currentString;
    private ArrayList<String> declaredObjects = new ArrayList<String>();

    public String GenerateCode(ASTNode node){
        builder = new CodeGenStringBuilder();


        node.accept(this);
        Setup();

        return builder.ReturnString();
    }

    private void Setup(){
        builder.AppendObjectDeclarations();
        for (String str : declaredObjects) {
            builder.AppendText(str);
        }
        builder.AppendCloseObjectDeclarations();
    }

    private void AssignNumber(AssignExpressionNode node){
        currentString = "";
        node.children.get(0).accept(this);
        currentString += " = ";
        node.children.get(1).accept(this);
        currentString += ";";
        builder.AppendText(currentString);
    }

    @Override
    public void visit(CodeBlockNode node) {
        for(ASTNode child : node.children){
            child.accept(this);  
		}
    }

    @Override
    public void visit(ErrorNode node) {
        //Error = do nothing
    }

    @Override
    public void visit(IdentificationNode node) {
        currentString += node.name;
    }

    @Override
    public void visit(ProgramNode node) {
        // Just need to visit its codeblock node, which contains the rest.
        node.children.get(0).accept(this);
    }


    @Override
    public void visit(ObjectDeclarationNode node) {
        currentString = "";

        currentString += "pinMode("+node.pinNumber+", ";
        node.children.get(1).accept(this);
        
        declaredObjects.add(currentString);
    }

    @Override
    public void visit(ObjIdNode node) {
        if(node.objType.equalsIgnoreCase("led")){
            currentString += "OUTPUT);";
        } else if(node.objType.equalsIgnoreCase("button")){
            currentString += "INPUT);";
        }
    }

    @Override
    public void visit(FunctionDeclarationNode node) {
        currentString = "";
        node.children.get(0).accept(this);//type
        currentString += " ";
        node.children.get(1).accept(this);//id
        currentString += "(";
        node.children.get(2).accept(this);//params
        currentString += ") {";
        node.children.get(3).accept(this); //body
        currentString += "}";
        builder.AppendText(currentString);   
    }

    @Override
    public void visit(FunctionParamsNode node) {
        for (int i = 0; i < node.children.size(); i++){
            node.children.get(i).accept(this);
            if(i+1 < node.children.size()){
                currentString += ", ";
            }
        }
    }

    @Override
    public void visit(FunctionParamsDeclNode node) {
        node.children.get(0).accept(this);
        currentString += " ";
        node.children.get(1).accept(this);
    }
    
    @Override
    public void visit(FunctionBodyNode node) {
        builder.increaseIndent();
        node.children.forEach(child -> {
            child.accept(this);
        });
        builder.decreaseIndent();
    }

    @Override
    public void visit(TypeNodesNode node) {
        currentString += node.typeName;
    }


    @Override
    public void visit(VariableDeclarationNode node) {
        currentString = "";
        if(node.children.size() == 1){
            node.children.get(0).accept(this);
        } else {
            node.children.get(0).accept(this);
            currentString += " ";
            node.children.get(1).accept(this);
            if( node.children.size() == 3){
                currentString += " = ";
                node.children.get(2).accept(this);
            }
            currentString += ";";
        }  
        builder.AppendText(currentString);
    }

    @Override
    public void visit(ArrayNode node) {
        node.children.get(0).accept(this);
        currentString += " ";
        node.children.get(1).accept(this);
        currentString += "[";
        node.children.get(2).accept(this);
        currentString += "] = {";
        for (int i = 3; i < node.children.size(); i++){
            node.children.get(i).accept(this);
            if(i+1 < node.children.size()){
                currentString += ", ";
            }
        }
        currentString += "};";
    }

    @Override
    public void visit(ArrayValueNode node) {
        node.children.get(0).accept(this);
    }

    @Override
    public void visit(AssignExpressionNode node) {
        try{
            if(node.children.get(1).type.kind == TypeDescriptorKind.number){
                AssignNumber(node);
            }

        } catch (NullPointerException e){
            System.out.println("Error in CodeGenVisitor.visit(AssignmentNode node): node.type.kind is null");
        }
    }

    @Override
    public void visit(StringLiteralNode node) {
        currentString += node.str;
    }

    @Override
    public void visit(BooleanValueNode node) {
        currentString += "" + node.value;
    }

    @Override
    public void visit(MultiplicationExpressionNode node){
        TypeDescriptorKind LeftChildKind = node.children.get(0).type.kind;
        TypeDescriptorKind RightChildKind = node.children.get(1).type.kind;
        if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.number){
            node.children.get(0).accept(this);
            currentString += node.operator;
            node.children.get(1).accept(this);
        }
    }

    @Override
    public void visit(ExpressionNode node) {
        node.children.get(0).accept(this);
    }

    @Override
    public void visit(TermNode node) {
        node.children.get(0).accept(this);
    }

    @Override
    public void visit(NumberNode node) {
        node.children.get(0).accept(this);
    }

    @Override
    public void visit(FunctionCallNode node) {
        currentString = "";
        node.children.get(0).accept(this);
        currentString += "(";
        node.children.get(1).accept(this);
        currentString += ");";

        builder.AppendText(currentString);
    }

    @Override
    public void visit(ActualParamsNode node) {
        for(int i = 0; i < node.children.size(); i++){
            node.children.get(i).accept(this);
            if(i+1 < node.children.size()){
                currentString += ", ";
            }
        }
    }

    @Override
    public void visit(BinaryExpressionNode node) {
        // abstract class, so no need to handle
    }

    @Override
    public void visit(StatementNode node) {
        // Abstract, so no need to configure
    }

    @Override
    public void visit(PrintNode node) {
        //TODO ER I TVIVL OM HVORDAN MAN PRINTER NOGET I ARDUINO KONSOLLEN
    }

    @Override
    public void visit(LogicalExpressionNode node) {
        node.children.get(0).accept(this);
        currentString += node.operator;
        node.children.get(1).accept(this);
    }

    @Override
    public void visit(AdditionExpressionNode node) {
        TypeDescriptorKind LeftChildKind = node.children.get(0).type.kind;
        TypeDescriptorKind RightChildKind = node.children.get(1).type.kind;

        if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.number){
            node.children.get(0).accept(this);
            currentString = " + ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.string && RightChildKind == TypeDescriptorKind.string){
            node.children.get(0).accept(this);
            currentString = " + ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.string && RightChildKind != TypeDescriptorKind.string && RightChildKind != TypeDescriptorKind.number){
            node.children.get(0).accept(this);
            currentString = " + ";
            currentString += "\"";
            node.children.get(1).accept(this);
            currentString += "\"";
        } else if(LeftChildKind != TypeDescriptorKind.string && RightChildKind == TypeDescriptorKind.string && LeftChildKind != TypeDescriptorKind.number){
            currentString += "\"";
            node.children.get(0).accept(this);
            currentString += "\"";
            currentString = " + ";
            node.children.get(1).accept(this);
        }
    }

    @Override
    public void visit(WhileNode node) {
        currentString += "while(";
        node.children.get(0).accept(this);
        currentString += "){";
        builder.AppendText(currentString);
        builder.increaseIndent();
    }

    @Override
    public void visit(DivisionExpressionNode node) {
        node.children.get(0).accept(this);
        currentString += node.operator;
        node.children.get(0).accept(this);
    }

    @Override
    public void visit(ElseIfStmtNode node) {
        currentString += "else if(";
        node.children.get(0).accept(this);
        currentString += "){";
        builder.AppendText(currentString);
        builder.increaseIndent();

        node.children.get(1).accept(this);

        builder.decreaseIndent();
        builder.AppendText("}");
    }

    @Override
    public void visit(ElseStmtNode node){
        builder.AppendSpace();
        currentString += "else {";
        builder.increaseIndent();
        node.children.get(0).accept(this);
        builder.decreaseIndent();
        currentString += "}";
    }

    @Override
    public void visit(IfStmtNode node) {
        builder.AppendSpace();
        currentString += "if(";
        node.children.get(0).accept(this);
        currentString += "){";
        builder.AppendText(currentString);

        builder.increaseIndent();

        node.children.get(1).accept(this);

        builder.decreaseIndent();
        builder.AppendText("}");

        for(int i = 2; i < node.children.size(); i++){
            node.children.get(i).accept(this);
        }
    }

    @Override
    public void visit(DeclarationNode node) {
        // abstract = ignore
    }


    @Override
    public void visit(IntLiteralNode node) {
        currentString += node.value;
    }

    @Override
    public void visit(FloatLiteralNode node) {
        currentString += node.value;
    }

    @Override
    public void visit(DoWhileNode node) {
        builder.AppendSpace();
        currentString += "do {";
        builder.increaseIndent();
        node.children.get(0).accept(this);
        currentString += "} \n while (";
        for(int i = 1; i < node.children.size(); i++){
            node.children.get(1).accept(this);
        }
        currentString += ");";
        builder.decreaseIndent();    
    }

    @Override
    public void visit(LoopStmtNode node) {
        builder.AppendSpace();
        currentString += "for(int index = 0; index < ";
        node.children.get(0).accept(this);
        currentString += "; index++) {";
        builder.increaseIndent();
        builder.AppendSpace();
        node.children.get(1).accept(this);
        builder.AppendSpace();
        currentString += "}";
        builder.decreaseIndent();
    }

    @Override
    public void visit(WhenNode node) {
        builder.AppendSpace();
        currentString += "switch(";
        node.children.get(0).accept(this);
        currentString += ") {";           
        builder.increaseIndent();
        for(int i = 1; i <= node.children.get(1).children.size() ; i++) {
            if(i == node.children.get(1).children.size()) {
                node.children.get(1).children.get(i).accept(this);
            } else { 
                node.children.get(i).accept(this);
            }
        }
        currentString += "}";
    }

    @Override
    public void visit(CaseNode node) {
        currentString += "\t case ";
        node.children.get(0).accept(this);
        currentString += ":";
        for (int i = 1; i < node.children.size(); i++){
            currentString += "\t";
            node.children.get(i).accept(this);
            currentString += "\n";
        }
        currentString += "\t break;";
        
    }

    @Override
    public void visit(DefaultNode node) {
        currentString += "\t default:";
        for (ASTNode n : node.children) {
            currentString += "\t";
            n.accept(this);
        }
        currentString += "\t break;";
    }

    @Override
    public void visit(WaitNode node) {
        builder.AppendSpace();
        currentString += "delay(";
        node.children.get(0).accept(this);
        currentString += ");";
        builder.AppendSpace();
    }

    @Override
    public void visit(ReturnNode node) {
        builder.AppendSpace();
        currentString += "return";
        if(node.children.size() == 1){
            node.children.get(0).accept(this);
        }
        currentString += ";";
    }

    @Override
    public void visit(ObjFuncallStmtNode node) {
        currentString += "!";
        
    }

    @Override
    public void visit(TimeNode node) {
       currentString += node.timeValue;
    }

   
    
}
