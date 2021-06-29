package CodeGeneration;

import java.util.ArrayList;
import java.util.HashMap;

import AST.*;
import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.TypeDescriptorKind;

public class CodeGenVisitor implements IVisitor {

    private CodeGenStringBuilder builder;
    private String currentString;
    private ArrayList<String> declaredObjects = new ArrayList<String>();
    //private ArrayList<String> declaredFunctions = new ArrayList<String>();
    private HashMap<String, Integer> objects = new HashMap<String, Integer>();


    public CodeGenVisitor(HashMap<String, Integer> declaredObjects2) {
        objects = declaredObjects2;
	}

	public String GenerateCode(ASTNode node){
        builder = new CodeGenStringBuilder();

        node.accept(this); //Creates global variables
        //AppendOtherFunctions();
        Setup(); //creates Setup() with all the objects
        //AppendLoop(); //creates all functions as well as loop()

        return builder.ReturnString();
    }

    public String getCurrentString() {
        return currentString;
    }

    public ArrayList<String> getDeclaredObjects() {
        return declaredObjects;
    }

    private void Setup(){
        builder.AppendObjectDeclarations();
        builder.AppendText("Serial.begin(9600);");
        for (String str : declaredObjects) {
            builder.AppendText(str);
        }
        builder.AppendCloseObjectDeclarations();
    }

   /* private void AppendLoop(){
        for (String string : declaredFunctions) {
            if(string.contains("loop")){
                builder.AppendText(string);
            }
        }
    }

    private void AppendOtherFunctions(){
        for (String string : declaredFunctions) {
            if(!string.contains("loop")){
                builder.AppendText(string);
            }
        }
    }*/

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
        if(node.name.equalsIgnoreCase("program")){
            currentString += "void loop";
        } else {
            currentString += node.name;
        }
        
    }

    @Override
    public void visit(ProgramNode node) {
        // Just need to visit its codeblock node, which contains the rest.
        node.children.get(0).accept(this);
    }


    @Override
    public void visit(ObjectDeclarationNode node) {
        currentString = "";

        currentString += "pinMode("+node.pinNumber+", " + node.objId;
        currentString += ");";
        
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
        IdentificationNode idnode = (IdentificationNode) node.children.get(1);
        if(!idnode.name.equalsIgnoreCase("program")){
            node.children.get(0).accept(this);//type
            currentString += " ";
        }
        node.children.get(1).accept(this);//id
        currentString += "(";
        node.children.get(2).accept(this);//params
        currentString += ") {";
        builder.AppendText(currentString);
        builder.increaseIndent();
        node.children.get(3).accept(this); //body
        builder.decreaseIndent();
        builder.AppendText("}\n");
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
        currentString = "";
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
            if(node.children.get(0).type == null){
                AssignVariable(node);
            }else if(node.children.get(0).type.kind == null){
                AssignVariable(node);
            } else if(node.children.get(0).type.kind == TypeDescriptorKind.number){
                AssignNumber(node);
            } else if(node.children.get(1).type.kind == TypeDescriptorKind.bool){
                AssignBool(node);
            }

        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Error in CodeGenVisitor.visit(AssignmentNode node): node.type.kind is null ");
        }
    }

    private void AssignBool(AssignExpressionNode node){
        currentString = "";
        node.children.get(0).accept(this);
        currentString += " = ";
        node.children.get(1).accept(this);
        currentString += ";";
        builder.AppendText(currentString);
    }

    private void AssignVariable(AssignExpressionNode node){
        currentString = "";
        node.children.get(0).accept(this);
        currentString += " = ";
        node.children.get(1).accept(this);
        currentString += ";";
        builder.AppendText(currentString);
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
        TypeDescriptorKind LeftChildKind;
        TypeDescriptorKind RightChildKind;

        

        if(node.children.get(0).type != null){
            LeftChildKind = node.children.get(0).type.kind;
        } else if(node.children.get(0) instanceof MultiplicationExpressionNode || node.children.get(0) instanceof DivisionExpressionNode || node.children.get(0).children.get(0) instanceof StringLiteralNode){
            LeftChildKind = node.children.get(0).children.get(0).type.kind;
        } else if(node.children.get(0).children.get(0).getClass().getSimpleName().equalsIgnoreCase("IdentificationNode")||node.children.get(0).children.get(0).children.get(0).getClass().getSimpleName().equalsIgnoreCase("IdentificationNode")){
            LeftChildKind = TypeDescriptorKind.string;
        } else {
            LeftChildKind = null;
        }

        if(node.children.get(1).type != null) {
            RightChildKind = node.children.get(1).type.kind;
        } else if(node.children.get(1) instanceof MultiplicationExpressionNode || node.children.get(1) instanceof DivisionExpressionNode || node.children.get(1).children.get(0) instanceof StringLiteralNode){
            RightChildKind = node.children.get(1).children.get(0).type.kind;
        } else if(node.children.get(1).children.get(0).getClass().getSimpleName().equalsIgnoreCase("IdentificationNode")||node.children.get(1).children.get(0).children.get(0).getClass().getSimpleName().equalsIgnoreCase("IdentificationNode")){
            RightChildKind = TypeDescriptorKind.string;
        } else {
            RightChildKind = null;
        }
        
        if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.number){
            node.children.get(0).accept(this);
            currentString += " * ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.string && RightChildKind == TypeDescriptorKind.string){
            node.children.get(0).accept(this);
            currentString += " * ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.string && RightChildKind == TypeDescriptorKind.number){
            node.children.get(0).accept(this);
            currentString += " + ";
            node.children.get(1).accept(this);
        }else if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.string){
            node.children.get(0).accept(this);
            currentString += " + ";
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
        if(node.parent instanceof TermNode){
            builder.increaseIndent();
            node.children.get(0).accept(this);
            currentString += "(";
            if(node.children.size() > 1) {
                node.children.get(1).accept(this);
            }
            currentString += ")";
        } else {
            currentString = "";
            node.children.get(0).accept(this);
            currentString += "(";
            if(node.children.size() > 1) {
                node.children.get(1).accept(this);
            }
            currentString += ");";
            builder.AppendText(currentString);
        }
        
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
        // abstract
    }

    @Override
    public void visit(PrintNode node) {
        currentString = "Serial.println(";
        node.children.get(0).accept(this);
        currentString += ");";
        builder.AppendText(currentString); 
    }

    @Override
    public void visit(LogicalExpressionNode node) {
        if(node.children.size() == 1){
            node.children.get(0).accept(this);
        } else {
            node.children.get(0).accept(this);
            currentString += node.operator;
            node.children.get(1).accept(this);
        }
            
        
    }

    @Override
    public void visit(AdditionExpressionNode node) {
        TypeDescriptorKind LeftChildKind;
        TypeDescriptorKind RightChildKind;

        
        if(node.children.get(0).type != null){
            LeftChildKind = node.children.get(0).type.kind;
        } else if(node.children.get(0) instanceof MultiplicationExpressionNode || node.children.get(0) instanceof DivisionExpressionNode || node.children.get(0).children.get(0) instanceof StringLiteralNode){
            LeftChildKind = node.children.get(0).children.get(0).type.kind;
        }else if(node.children.get(0).children.get(0).getClass().getSimpleName().equalsIgnoreCase("IdentificationNode") ||node.children.get(0).children.get(0).children.get(0).getClass().getSimpleName().equalsIgnoreCase("IdentificationNode")){
            LeftChildKind = TypeDescriptorKind.string;
        } else {
            LeftChildKind = null;
        }

        if(node.children.get(1).type != null) {
            RightChildKind = node.children.get(1).type.kind;
        } else if(node.children.get(1) instanceof MultiplicationExpressionNode || node.children.get(1) instanceof DivisionExpressionNode || node.children.get(1).children.get(0) instanceof StringLiteralNode){
            RightChildKind = node.children.get(1).children.get(0).type.kind;
        } else if(node.children.get(1).children.get(0).getClass().getSimpleName().equalsIgnoreCase("IdentificationNode") ||node.children.get(1).children.get(0).children.get(0).getClass().getSimpleName().equalsIgnoreCase("IdentificationNode")){
            RightChildKind = TypeDescriptorKind.string;
        } else {
            RightChildKind = null;
        }
        
        if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.number){
            node.children.get(0).accept(this);
            currentString += " + ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.string && RightChildKind == TypeDescriptorKind.string){
            node.children.get(0).accept(this);
            currentString += " + ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.string && RightChildKind == TypeDescriptorKind.number){
            node.children.get(0).accept(this);
            currentString += " + ";
            node.children.get(1).accept(this);
        } else if(LeftChildKind == TypeDescriptorKind.number && RightChildKind == TypeDescriptorKind.string){
            node.children.get(0).accept(this);
            currentString += " + ";
            node.children.get(1).accept(this);
        }
    }

    @Override
    public void visit(WhileNode node) {
        currentString = "while(";
        node.children.get(0).accept(this);
        currentString += "){";
        builder.AppendText(currentString);
        builder.increaseIndent();
        node.children.get(1).accept(this);
        builder.decreaseIndent();
        builder.AppendText("}");
    }

    @Override
    public void visit(DivisionExpressionNode node) {
        node.children.get(0).accept(this);
        currentString += " "+ node.operator + " ";
        node.children.get(1).accept(this);
    }

    @Override
    public void visit(ElseIfStmtNode node) {
        currentString = "else if(";
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
        currentString = "else {";
        builder.AppendText(currentString);
        builder.increaseIndent();
        node.children.get(0).accept(this);
        builder.decreaseIndent();
        builder.AppendText("}");
    }

    @Override
    public void visit(IfStmtNode node) {
        builder.AppendSpace();
        currentString = "if(";
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
        builder.AppendText("do {");
        builder.increaseIndent();
        node.children.get(1).accept(this);
        builder.decreaseIndent();

        currentString = "} while (";
        node.children.get(0).accept(this);
        currentString += ");";
        builder.AppendText(currentString);
        builder.decreaseIndent(); 

    }

    @Override
    public void visit(LoopStmtNode node) {
        currentString = "for(int value = 0; value < ";
        node.children.get(0).accept(this);
        currentString += "; value++) {";
        builder.AppendText(currentString);
        builder.increaseIndent();
        node.children.get(1).accept(this);
        builder.decreaseIndent();
        builder.AppendText("}");
    }

    @Override
    public void visit(WhenNode node) {
        builder.AppendSpace();
        currentString = "switch(";
        node.children.get(0).accept(this);
        currentString += ") {"; 
        builder.AppendText(currentString);          
        builder.increaseIndent();
        for(int i = 0; i < node.children.get(1).children.size() ; i++) {
            if(i+1 == node.children.get(1).children.size()) {
                node.children.get(1).children.get(i).accept(this);
            } else { 
                node.children.get(1).children.get(i).accept(this);
            }
        }
        builder.AppendText("}");
    }

    @Override
    public void visit(CaseNode node) {
        currentString = "\t case ";
        node.children.get(0).accept(this);
        currentString += ":";
        for (int i = 1; i < node.children.size(); i++){
            currentString += "\t";
            node.children.get(i).accept(this);
            currentString += "\n";
        }
        currentString += "\t break;";

        builder.AppendText(currentString);
        
    }

    @Override
    public void visit(DefaultNode node) {
        currentString = "\t default:";
        for (ASTNode n : node.children) {
            currentString += "\t";
            n.accept(this);
        }
        currentString += "\t break;";
        builder.AppendText(currentString);
    }

    @Override
    public void visit(WaitNode node) {
        currentString = "delay(";
        node.children.get(0).accept(this);
        currentString += ");";
        builder.AppendText(currentString);
    }

    @Override
    public void visit(ReturnNode node) {
        currentString = "return";
        if(node.children.size() == 1){
            currentString += " ";
            node.children.get(0).accept(this);
        }
        currentString += ";";
        builder.AppendText(currentString);
    }

    @Override
    public void visit(ObjFuncallStmtNode node) {
        IdentificationNode id = (IdentificationNode)node.children.get(0);
        ObjFunccallIdNode objCall = (ObjFunccallIdNode)node.children.get(1);
        try {
            int literal = objects.get(id.name);
            if(objCall.function.equalsIgnoreCase("on()")){
                currentString = "digitalWrite(" + literal + ", HIGH);";
                builder.AppendText(currentString);
            } else if(objCall.function.equalsIgnoreCase("off()")){
                currentString = "digitalWrite(" + literal + ", LOW);";
                builder.AppendText(currentString);
            } else if(objCall.function.equalsIgnoreCase("ison()")){
                currentString += "digitalRead("+literal+") == HIGH";
            } else if(objCall.function.equalsIgnoreCase("isoff()")){
                currentString += "digitalRead("+literal+") == LOW";
            }
        } catch (Exception e) {
            System.out.println("Something went wrong in the declared objects");
        }
    }


    @Override
    public void visit(TimeNode node) {
       currentString += node.timeValue;
    }
}
