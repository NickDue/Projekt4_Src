import ANTLR.AELBaseVisitor;
import ANTLR.AELParser;
import ANTLR.AELParser.*;
import AST.*;

public class ASLBuilderVisitor extends AELBaseVisitor<ASTNode>{
    
    @Override
    public ASTNode visitProgram(ProgramContext ctx) {
        ASTNode node = new ProgramNode(null);
        CodeBlockNode stmtNode = new CodeBlockNode(node);
        node.children.add(stmtNode);
        ctx.decl().forEach(child ->{
            stmtNode.children.add(visitDecl((DeclContext)child, stmtNode));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitDecl(AELParser.DeclContext ctx, ASTNode parent) {
        try {
            String name = ctx.children.get(0).getClass().getSimpleName();
            ASTNode node;
            switch(name){
                    case "VarDeclContext":
                        node = visitVarDecl((VarDeclContext) ctx.children.get(0), parent);
                        break;
                    case "FuncDeclContext":
                        node = visitFuncDecl((FuncDeclContext) ctx.children.get(0), parent);
                        break;
                    case "ObjDeclContext":
                        node = visitObjDecl((ObjDeclContext) ctx.children.get(0), parent);
                        break;
                    default:
                        return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
            }
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ASTNode visitFuncDecl(FuncDeclContext ctx, ASTNode parent) {
        FunctionDeclarationNode node = new FunctionDeclarationNode(parent);

        ASTNode type = visitType((TypeContext) ctx.children.get(0), node, false);
        String id = ctx.ID().getText();
        ASTNode params = visitFParams((FParamsContext) ctx.children.get(2), node);
        ASTNode body = visitFuncBody((FuncBodyContext) ctx.children.get(3), node);

        node.children.add(type);
        node.children.add(new IdentificationNode(node, id));
        node.children.add(params);
        node.children.add(body);

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }
    
    public ASTNode visitType(TypeContext ctx, ASTNode parent, boolean variable) {
        String type = ctx.getText();
        ASTNode node;
        switch (type) {
            case "number":
                node = new NumberTypeNode(parent);
                break;
            case "string":
                node = new StringTypeNode(parent);
                break;
            case "bool":
                node = new BoolTypeNode(parent);
                break;
            case "char":
                node = new CharTypeNode(parent);
                break;
            case "void":
                if(variable){
                    return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
                }
                node = new VoidTypeNode(parent);
            default:
                return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;

    }
    
    public ASTNode visitFParams(FParamsContext ctx, ASTNode parent) {
        FunctionParamsNode node = new FunctionParamsNode(parent);
        ctx.fParamsDecl().forEach(child -> {
            node.children.add(visitFParamsDecl((FParamsDeclContext) child, node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }
    
    public ASTNode visitFParamsDecl(FParamsDeclContext ctx, ASTNode parent) {
        FunctionParamsNode node = new FunctionParamsNode(parent);
        ASTNode type =  visitType((TypeContext) ctx.children.get(0), node, true);
        String id = ctx.ID().getText();

        node.children.add(type);
        node.children.add(new IdentificationNode(node, id));

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }
    
    public ASTNode visitFuncBody(FuncBodyContext ctx, ASTNode parent) {
        FunctionBodyNode node = new FunctionBodyNode(parent);
        ctx.varDecl().forEach(child -> {
            node.children.add(visitVarDecl((VarDeclContext)child, node));
        });
        ctx.stmt().forEach(child -> {
            node.children.add(visitStmt((StmtContext)child, node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitStmt(StmtContext ctx, ASTNode parent) {
        String name = ctx.children.get(0).getClass().getSimpleName();
        switch (name){
            case "AssignExpContext":
                return visitAssignExp((AssignExpContext) ctx.children.get(0), parent);
            case "PrintStmtContext":
                return visitPrintStmt((PrintStmtContext) ctx.children.get(0), parent);
            case "IfStmtContext":
                return visitIfStmt((IfStmtContext) ctx.children.get(0), parent);
            case "DoWhileStmtContext":
                return visitDoWhileStmt((DoWhileStmtContext) ctx.children.get(0), parent);
            case "WhileStmtContext":
                return visitWhileStmt((WhileStmtContext) ctx.children.get(0), parent);
            case "LoopStmtContext":
                return visitLoopStmt((LoopStmtContext) ctx.children.get(0), parent);
            case "WhenStmtContext":
                return visitWhenStmt((WhenStmtContext) ctx.children.get(0), parent);
            case "WaitStmtContext":
                return visitWaitStmt((WaitStmtContext) ctx.children.get(0), parent);
            case "ReturnStmtContext":
                return visitReturnStmt((ReturnStmtContext) ctx.children.get(0), parent);
            case "FunccallContext":
                return visitFunccall((FunccallContext) ctx.children.get(0), parent);
            case "ObjFunccallContext":
                return visitObjFunccall((ObjFunccallContext) ctx.children.get(0), parent);
            default:
                return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitReturnStmt(ReturnStmtContext ctx, ASTNode parent) {
        ReturnNode node = new ReturnNode(parent);
        if(ctx.exp() != null){
            node.children.add(visitExp(ctx.exp(), node, null));
        }
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitObjFunccall(ObjFunccallContext ctx, ASTNode parent) {
        ObjFuncallStmtNode node = new ObjFuncallStmtNode(parent);
        String id = ctx.ID().getText();
        node.children.add(new IdentificationNode(node, id));
        ASTNode objId = visitObjFunccallId(ctx.objFunccallId(), node);
        node.children.add(objId);

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitObjFunccallId(ObjFunccallIdContext ctx, ASTNode parent){
        ObjFunccallIdNode node = new ObjFunccallIdNode(parent);
        if(ctx.ONFUNC() != null){
            node.function = ctx.ONFUNC().getText();
        } else if(ctx.OFFFUNC() != null){
            node.function = ctx.OFFFUNC().getText();
        } else if(ctx.READFUNC() != null){
            node.function = ctx.READFUNC().getText();
        } else if(ctx.WRITEFUNC() != null){
            node.function = ctx.WRITEFUNC().getText();
        } else if(ctx.ISONFUNC() != null){
            node.function = ctx.ISONFUNC().getText();
        } else if(ctx.ISOFFFUNC() != null){
            node.function = ctx.ISOFFFUNC().getText();
        } else {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitWaitStmt(WaitStmtContext ctx, ASTNode parent) {
        WaitNode node = new WaitNode(parent);
        ASTNode timeNode = visitTime(ctx.time(), node);
        node.children.add(timeNode);
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitTime(TimeContext ctx, ASTNode parent) {
        TimeNode node = new TimeNode(parent);
        String context = ctx.getText();
        long value = 0; 
        int different = 0;
        if(context.contains("h")){
            value += Long.parseLong(ctx.intLiteral(different).getText()) * 60 * 60 * 1000;
            different++;
        }
        if(context.contains("m")){
            value += Long.parseLong(ctx.intLiteral(different).getText()) * 60 * 1000;
            different++;
        }
        if(context.contains("s")){
            value += Long.parseLong(ctx.intLiteral(different).getText()) * 1000;
            different++;
        }
        if(context.contains("ms")){
            value += Long.parseLong(ctx.intLiteral(different).getText());
            different++;
        }
        node.timeValue = value;

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitWhenStmt(WhenStmtContext ctx, ASTNode parent) {
        WhenNode node = new WhenNode(parent);
        ASTNode exp = visitExp(ctx.exp(), node, null);
        node.children.add(exp);
        ctx.case_stmt().forEach(child -> {
            node.children.add(visitCase_stmt((Case_stmtContext) child, node));
        });
        if(ctx.default_stmt() != null){
            node.children.add(visitDefault_stmt((Default_stmtContext) ctx.default_stmt(), node));
        }
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitCase_stmt(Case_stmtContext ctx, ASTNode parent) {
        CaseNode node = new CaseNode(parent);
        ASTNode term = visitTerm(ctx.term(), node);
        node.children.add(term);
        ctx.stmt().forEach(child ->{
            node.children.add(visitStmt((StmtContext)ctx.stmt(),node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitDefault_stmt(Default_stmtContext ctx, ASTNode parent) {
        DefaultNode node = new DefaultNode(parent);
        ctx.stmt().forEach(child ->{
            node.children.add(visitStmt((StmtContext)ctx.stmt(),node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitLoopStmt(LoopStmtContext ctx, ASTNode parent){
        LoopStmtNode node = new LoopStmtNode(parent);
        int literal = Integer.parseInt(ctx.intLiteral().getText());
        node.children.add(new IntLiteralNode(node, literal));
        ctx.stmt().forEach(child -> {
            node.children.add(visitStmt((StmtContext) child, node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitDoWhileStmt(DoWhileStmtContext ctx, ASTNode parent) {
        DoWhileNode node = new DoWhileNode(parent);
        node.children.add(visitLogStmt(ctx.logStmt(), node));
        ctx.stmt().forEach(child -> {
            node.children.add(visitStmt((StmtContext) child, node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitWhileStmt(WhileStmtContext ctx, ASTNode parent) {
        WhileNode node = new WhileNode(parent);
        node.children.add(visitLogStmt(ctx.logStmt(), node));
        ctx.stmt().forEach(child -> {
            node.children.add(visitStmt((StmtContext) child, node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitPrintStmt(PrintStmtContext ctx, ASTNode parent) {
        PrintNode node = new PrintNode(parent);
        ASTNode exp = visitExp(ctx.exp(), node, null);
        node.children.add(exp);

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitIfStmt(IfStmtContext ctx, ASTNode parent) {
        IfStmtNode node = new IfStmtNode(parent);
        CodeBlockNode stmtNode = new CodeBlockNode(node);
        node.children.add(visitLogStmt(ctx.logStmt(), node));
        ctx.stmt().forEach(child -> {
            stmtNode.children.add(visitStmt((StmtContext) child, node));
        });
        node.children.add(stmtNode);
        if(ctx.elseIfStmt() != null){
            ctx.elseIfStmt().forEach(child -> {
                node.children.add(visitElseIfStmt((ElseIfStmtContext) child, node));
            });
        }
        if (ctx.elseStmt() != null) {
            node.children.add(visitElseStmt(ctx.elseStmt(), node));
        }
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitElseIfStmt(ElseIfStmtContext ctx, ASTNode parent) {
        ElseIfStmtNode node = new ElseIfStmtNode(parent);
        node.children.add(visitLogStmt(ctx.logStmt(), node));
        ctx.stmt().forEach(child -> {
            node.children.add(visitStmt((StmtContext) child, node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitElseStmt(ElseStmtContext ctx, ASTNode parent) {
        ElseStmtNode node = new ElseStmtNode(parent);
        ctx.stmt().forEach(child -> {
            node.children.add(visitStmt((StmtContext) child, node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitLogStmt(LogStmtContext ctx, ASTNode parent) {
        LogicalExpressionNode node = new LogicalExpressionNode(parent);
        node.operator = ctx.logOp().getText();
        ctx.addexpr().forEach(child -> {
            node.children.add(visitAddexpr((AddexprContext) child, node));
        });
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitVarDecl(VarDeclContext ctx, ASTNode parent) {
        String name = ctx.children.get(0).getClass().getSimpleName();
        VariableDeclarationNode node = new VariableDeclarationNode(parent);
        if(name.equalsIgnoreCase("ArrayContext")){
            node.children.add(visitArray((ArrayContext) ctx.children.get(0), parent));
        }else{
            ASTNode type = visitType((TypeContext) ctx.children.get(0), parent, true);
            String id = ctx.ID().getText();
            boolean assign = ctx.ASSIGN().getText() != null;
            node.children.add(type);
            node.children.add(new IdentificationNode(node, id));


            if(!assign && ctx.exp() != null || assign && ctx.exp() == null)
                return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
            else {
                ASTNode exp = visitExp((ExpContext) ctx.children.get(3), parent, type);
                node.children.add(exp);
            }
        }
        
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }
    
    public ASTNode visitArray(ArrayContext ctx, ASTNode parent) {
        ArrayNode node = new ArrayNode(parent);

        ASTNode type = visitType((TypeContext) ctx.children.get(0), node, false);
        String id = ctx.ID().getText();
        int literal = Integer.parseInt(ctx.intLiteral().getText());

        node.children.add(type);
        node.children.add(new IdentificationNode(node, id));
        node.children.add(new IntLiteralNode(node, literal));
        ctx.arrayval().forEach(child -> {
            node.children.add(visitArrayval((ArrayvalContext) child, node));
        });

        if(node.children.size()-3 != literal){
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    
    public ASTNode visitArrayval(ArrayvalContext ctx, ASTNode parent) {
        ArrayValueNode node = new ArrayValueNode(parent);

        if(ctx.ID() != null){
            node.children.add(new IdentificationNode(node, ctx.ID().getText()));
        } else if(ctx.intLiteral() != null){
            node.children.add(new IntLiteralNode(node, Integer.parseInt(ctx.intLiteral().getText())));
        } else if(ctx.STRINGLITERTAL() != null){
            node.children.add(new StringLiteralNode(node, ctx.getText()));
        } else if(ctx.TRUETERM() != null){
            node.children.add(new BooleanValueNode(node, true));
        } else if(ctx.FALSETERM() != null){
            node.children.add(new BooleanValueNode(node, false));
        } else {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitExp(ExpContext ctx, ASTNode parent, ASTNode type) {
        ExpressionNode node = new ExpressionNode(parent);

        if(ctx.assignExp() != null){
            ASTNode assignExp = visitAssignExp((AssignExpContext)ctx.children.get(0), parent);
            node.children.add(assignExp);
        } else if(ctx.addexpr() != null){
            ASTNode addexpr = visitAddexpr((AddexprContext) ctx.children.get(0), parent);
            node.children.add(addexpr);
        } else if(ctx.getText().startsWith("NOT")){
            ASTNode exp = visitExp((ExpContext)ctx.children.get(1), node, null);
            node.children.add(exp);
        } else if(ctx.getText().startsWith("-")){
            ASTNode exp = visitExp((ExpContext)ctx.children.get(1), node, null);
            node.children.add(exp);
        } else if(ctx.term() != null){
            ASTNode term = visitTerm((TermContext) ctx.children.get(0), node);
            node.children.add(term);
        } else {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitTerm(TermContext ctx, ASTNode parent) {
        TermNode node = new TermNode(parent);

        if(ctx.ID() != null) {
            node.children.add(new IdentificationNode(node, ctx.ID().getText()));
        } else if(ctx.number() != null){
            ASTNode number = visitNumber((NumberContext) ctx.children.get(0), node);
            node.children.add(number);
        } else if(ctx.STRINGLITERTAL() != null){
            node.children.add(new StringLiteralNode(node, ctx.getText()));
        } else if(ctx.TRUETERM() != null){
            node.children.add(new BooleanValueNode(node, true));
        } else if(ctx.FALSETERM() != null){
            node.children.add(new BooleanValueNode(node, false));
        } else if(ctx.exp() != null){
            ASTNode exp = visitExp((ExpContext) ctx.children.get(1), node, null);
            node.children.add(exp);
        } else if(ctx.funccall() != null){
            ASTNode funccall = visitFunccall((FunccallContext) ctx.children.get(0), node);
            node.children.add(funccall);
        } else {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitNumber(NumberContext ctx, ASTNode parent) {
        NumberNode node = new NumberNode(parent);
        String name = ctx.children.get(0).getClass().getSimpleName();
        if(name == "IntLiteralContext"){
            ASTNode intLit = visitIntLiteral((IntLiteralContext) ctx.children.get(0), node);
            node.children.add(intLit);
        } else if (name == "FloatLiteralContext"){
            ASTNode fLit = visitFloatLiteral((FloatLiteralContext) ctx.children.get(0), node);
            node.children.add(fLit);
        } else {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitIntLiteral(IntLiteralContext ctx, ASTNode parent) {
        int value = Integer.parseInt(ctx.getText());
        IntLiteralNode node = new IntLiteralNode(parent, value);

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitFloatLiteral(FloatLiteralContext ctx, ASTNode parent) {
        float value = Float.parseFloat(ctx.getText());
        FloatLiteralNode node = new FloatLiteralNode(parent, value);

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitFunccall(FunccallContext ctx, ASTNode parent) {
        FunctionCallNode node = new FunctionCallNode(parent);

        String id = ctx.ID().getText();
        ASTNode params = visitAParams((AParamsContext)ctx.children.get(2), node);
        
        node.children.add(new IdentificationNode(node, id));
        node.children.add(params);

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitAParams(AParamsContext ctx, ASTNode parent) {
        ActualParamsNode node = new ActualParamsNode(parent);

        if(ctx.aParams() != null){
            ASTNode exp = visitExp((ExpContext) ctx.children.get(0), parent, null);
            ASTNode params = visitAParams((AParamsContext) ctx.children.get(2), node);
            node.children.add(exp);
            node.children.add(params);
        } else if(ctx.aParams() == null){
            ASTNode exp = visitExp((ExpContext) ctx.children.get(0), parent, null);
            node.children.add(exp);
        } else {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }

    public ASTNode visitAddexpr(AddexprContext ctx, ASTNode parent) {
        ASTNode left, right;
        if (ctx.op == null) {
            return visitMultexpr(ctx.multexpr(), parent);
        } else if (ctx.op.getText().contains("+")) {
            left = visitMultexpr(ctx.multexpr(), parent);
            left.lineNumber = ctx.getStart().getLine();
            left.charPosition = ctx.getStart().getCharPositionInLine();
            right = visitAddexpr(ctx.addexpr(), parent);
            right.lineNumber = ctx.getStart().getLine();
            right.charPosition = ctx.getStart().getCharPositionInLine();

            ASTNode node = new AdditionExpressionNode(parent, left, right);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } else if (ctx.op.getText().contains("-")) {
            left = visitMultexpr(ctx.multexpr(), parent);
            left.lineNumber = ctx.getStart().getLine();
            left.charPosition = ctx.getStart().getCharPositionInLine();
            right = visitAddexpr(ctx.addexpr(), parent);
            right.lineNumber = ctx.getStart().getLine();
            right.charPosition = ctx.getStart().getCharPositionInLine();

            ASTNode node = new SubtractionExpressionNode(parent, left, right);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } else return new ErrorNode(parent, "Invalid operator at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

    }

    public ASTNode visitMultexpr(MultexprContext ctx, ASTNode parent) {
        ASTNode left, right;
        if (ctx.op == null) {
            return visitTerm((TermContext)ctx.term(), parent);
        } else if (ctx.op.getText().contains("*")) {
            left = visitTerm((TermContext)ctx.term(), parent);
            left.lineNumber = ctx.getStart().getLine();
            left.charPosition = ctx.getStart().getCharPositionInLine();
            right = visitMultexpr(ctx.multexpr(), parent);
            right.lineNumber = ctx.getStart().getLine();
            right.charPosition = ctx.getStart().getCharPositionInLine();

            ASTNode node = new MultiplicationExpressionNode(parent, left, right);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } else if (ctx.op.getText().contains("/")) {
            left = visitTerm(ctx.term(), parent);
            left.lineNumber = ctx.getStart().getLine();
            left.charPosition = ctx.getStart().getCharPositionInLine();
            right = visitMultexpr(ctx.multexpr(), parent);
            right.lineNumber = ctx.getStart().getLine();
            right.charPosition = ctx.getStart().getCharPositionInLine();

            ASTNode node = new DivisionExpressionNode(parent, left, right);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } else return new ErrorNode(parent, "Invalid operator at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
    }

    public ASTNode visitAssignExp(AssignExpContext ctx, ASTNode parent) {
        String id = ctx.ID().getText();
        boolean assign = ctx.ASSIGN().getText() != null;
        if(!assign){
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        ASTNode exp = visitExp((ExpContext) ctx.children.get(2), parent, null);
        AssignExpressionNode node = new AssignExpressionNode(parent);
        node.children.add(new IdentificationNode(parent, id));
        node.children.add(exp);
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();

        return node;
    }

    public ASTNode visitObjDecl(ObjDeclContext ctx, ASTNode parent) {
        ObjectDeclarationNode node = new ObjectDeclarationNode(parent);

        String id = ctx.ID().getText();
        ASTNode objId = visitObjFuncId((ObjFuncIdContext)ctx.children.get(2), node);
        int literal = Integer.parseInt(ctx.intLiteral().getText());

        node.children.add(new IdentificationNode(node, id));
        node.children.add(objId);
        node.children.add(new IntLiteralNode(node, literal));

        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }
     
    public ASTNode visitObjFuncId(ObjFuncIdContext ctx, ASTNode parent) {
        ObjFuncIdNode node = new ObjFuncIdNode(parent);
        if(!ctx.BUTTON().equals(null)){
            node.children.add(new ButtonNode(node));
        } else if(!ctx.LED().equals(null)) {
            node.children.add(new LedNote(node));
        } else {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        node.lineNumber = ctx.getStart().getLine();
        node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
    }
}
