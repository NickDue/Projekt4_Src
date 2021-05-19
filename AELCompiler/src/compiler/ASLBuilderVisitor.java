package compiler;

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
            ASTNode node;
            if(ctx.varDecl() != null){
                node = visitVarDecl((VarDeclContext) ctx.children.get(0), parent);

            } else if (ctx.funcDecl() != null){
                node = visitFuncDecl((FuncDeclContext) ctx.children.get(0), parent);

            } else if (ctx.objDecl() != null){
                node = visitObjDecl((ObjDeclContext) ctx.children.get(0), parent);
                
            } else {
                return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

            }
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
            
        }
    }
    
    public ASTNode visitFuncDecl(FuncDeclContext ctx, ASTNode parent) {
        try {
            FunctionDeclarationNode node = new FunctionDeclarationNode(parent);

            ASTNode type = visitType(ctx.TYPE().getText(), node, false);
            String id = ctx.ID().getText();
            ASTNode params = visitFParams((FParamsContext) ctx.children.get(2), node);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            ASTNode body = visitFuncBody((FuncBodyContext) ctx.children.get(3), stmtNode);

            node.children.add(type);
            node.children.add(new IdentificationNode(node, id));
            node.children.add(params);
            node.children.add(stmtNode);
            stmtNode.children.add(body);

            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }
    
    public ASTNode visitType(String type, ASTNode parent, boolean variable) {
        try {
            TypeNodesNode node;
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
                        return new ErrorNode(parent, "Error(VOID) in type called at " + parent.getClass().getSimpleName());
                    }
                    node = new VoidTypeNode(parent);
                    break;
                default:
                    return new ErrorNode(parent, "Error(DEFAULT) in type called at " + parent.getClass().getSimpleName());
            }
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Error(DEFAULT) in type called at " + parent.getClass().getSimpleName());
        }
        

    }
    
    public ASTNode visitFParams(FParamsContext ctx, ASTNode parent) {
        try {
            FunctionParamsNode node = new FunctionParamsNode(parent);
            ctx.fParamsDecl().forEach(child -> {
                node.children.add(visitFParamsDecl((FParamsDeclContext) child, node));
            });
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
        return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }
    
    /* THIS IS THE ACTUAL PARAMS LIKE number a, string b, bool c */
    public ASTNode visitFParamsDecl(FParamsDeclContext ctx, ASTNode parent) {
        try {
            FunctionParamsDeclNode node = new FunctionParamsDeclNode(parent);
            ASTNode type =  visitType(ctx.TYPE().getText(), node, true);
            String id = ctx.ID().getText();

            node.children.add(type);
            node.children.add(new IdentificationNode(node, id));

            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }
    
    public ASTNode visitFuncBody(FuncBodyContext ctx, ASTNode parent) {
        try {
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
        } catch (NullPointerException e) {
            
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitStmt(StmtContext ctx, ASTNode parent) {
        try {
            if(ctx.assignExp() != null){
                return visitAssignExp((AssignExpContext) ctx.children.get(0), parent);
            } else if(ctx.printStmt() != null){
                return visitPrintStmt((PrintStmtContext) ctx.children.get(0), parent);
            } else if(ctx.ifStmt() != null){
                return visitIfStmt((IfStmtContext) ctx.children.get(0), parent);
            } else if(ctx.doWhileStmt() != null){
                return visitDoWhileStmt((DoWhileStmtContext) ctx.children.get(0), parent);
            } else if(ctx.whileStmt() != null){
                return visitWhileStmt((WhileStmtContext) ctx.children.get(0), parent);
            } else if(ctx.loopStmt() != null){
                return visitLoopStmt((LoopStmtContext) ctx.children.get(0), parent);
            } else if(ctx.whenStmt() != null){
                return visitWhenStmt((WhenStmtContext) ctx.children.get(0), parent);
            } else if(ctx.waitStmt() != null){
                return visitWaitStmt((WaitStmtContext) ctx.children.get(0), parent);
            } else if(ctx.returnStmt() != null){
                return visitReturnStmt((ReturnStmtContext) ctx.children.get(0), parent);
            } else if(ctx.funccall() != null){
                return visitFunccall((FunccallContext) ctx.children.get(0), parent);
            } else if(ctx.objFunccall() != null){
                return visitObjFunccall((ObjFunccallContext) ctx.children.get(0), parent);
            } else if(ctx.exp() != null){
                return visitExp((ExpContext) ctx.children.get(0), parent, null);
            } else {
                return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
            }
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }

    public ASTNode visitReturnStmt(ReturnStmtContext ctx, ASTNode parent) {
        try {
            ReturnNode node = new ReturnNode(parent);
            if(ctx.exp() != null){
                node.children.add(visitExp(ctx.exp(), node, null));
            }
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitObjFunccall(ObjFunccallContext ctx, ASTNode parent) {
        try {
            ObjFuncallStmtNode node = new ObjFuncallStmtNode(parent);
            String id = ctx.ID().getText();
            node.children.add(new IdentificationNode(node, id));
            ASTNode objId = visitObjFunccallId(ctx.objFunccallId(), node);
            node.children.add(objId);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }
    
    public ASTNode visitObjFunccallId(ObjFunccallIdContext ctx, ASTNode parent){
        try {
            ObjFunccallIdNode node = new ObjFunccallIdNode(parent);
            if(ctx.ONFUNC() != null){
                node.function = ctx.ONFUNC().getText();
            } else if(ctx.OFFFUNC() != null){
                node.function = ctx.OFFFUNC().getText();
            }/* else if(ctx.READFUNC() != null){
                node.function = ctx.READFUNC().getText();
            } else if(ctx.WRITEFUNC() != null){
                node.function = ctx.WRITEFUNC().getText();
            }*/ else if(ctx.ISONFUNC() != null){
                node.function = ctx.ISONFUNC().getText();
            } else if(ctx.ISOFFFUNC() != null){
                node.function = ctx.ISOFFFUNC().getText();
            } else {
                return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
            }
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }

    public ASTNode visitWaitStmt(WaitStmtContext ctx, ASTNode parent) {
        try {
            WaitNode node = new WaitNode(parent);
            ASTNode timeNode = visitTime(ctx.time(), node);
            node.children.add(timeNode);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }

    public ASTNode visitTime(TimeContext ctx, ASTNode parent) {
        try {
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
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }

    public ASTNode visitWhenStmt(WhenStmtContext ctx, ASTNode parent) {
        try {
            WhenNode node = new WhenNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            ASTNode exp = visitExp(ctx.exp(), node, null);
            node.children.add(exp);
            ctx.case_stmt().forEach(child -> {
                stmtNode.children.add(visitCase_stmt((Case_stmtContext) child, node));
            });
            if(ctx.default_stmt() != null){
                stmtNode.children.add(visitDefault_stmt((Default_stmtContext) ctx.default_stmt(), node));
            }
            node.children.add(stmtNode);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }

    public ASTNode visitCase_stmt(Case_stmtContext ctx, ASTNode parent) {
        try {
            CaseNode node = new CaseNode(parent);
            ASTNode term = visitTerm(ctx.term(), node);
            node.children.add(term);
            ctx.stmt().forEach(child ->{
                node.children.add(visitStmt((StmtContext)ctx.stmt(),node));
            });
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (Exception e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitDefault_stmt(Default_stmtContext ctx, ASTNode parent) {
        try {
            DefaultNode node = new DefaultNode(parent);
            ctx.stmt().forEach(child ->{
                node.children.add(visitStmt((StmtContext)ctx.stmt(),node));
            });
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitLoopStmt(LoopStmtContext ctx, ASTNode parent){
        try {
            LoopStmtNode node = new LoopStmtNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            if(ctx.intLiteral() != null) {
                int literal = Integer.parseInt(ctx.intLiteral().getText());
                node.children.add(new IntLiteralNode(node, literal));
            } else if(ctx.ID() != null){
                node.children.add(new IdentificationNode(node, ctx.ID().getText()));
            }
            
            ctx.stmt().forEach(child -> {
                stmtNode.children.add(visitStmt((StmtContext) child, node));
            });
            node.children.add(stmtNode);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitDoWhileStmt(DoWhileStmtContext ctx, ASTNode parent) {
        try {
            DoWhileNode node = new DoWhileNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            node.children.add(visitLogStmt(ctx.logStmt(), node));
            ctx.stmt().forEach(child -> {
                stmtNode.children.add(visitStmt((StmtContext) child, node));
            });
            node.children.add(stmtNode);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitWhileStmt(WhileStmtContext ctx, ASTNode parent) {
        try {
            WhileNode node = new WhileNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            node.children.add(visitLogStmt(ctx.logStmt(), node));
            ctx.stmt().forEach(child -> {
                stmtNode.children.add(visitStmt((StmtContext) child, node));
            });
            node.children.add(stmtNode);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitPrintStmt(PrintStmtContext ctx, ASTNode parent) {
        try {
            PrintNode node = new PrintNode(parent);
            ASTNode exp = visitExp(ctx.exp(), node, null);
            node.children.add(exp);

            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (Exception e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitIfStmt(IfStmtContext ctx, ASTNode parent) {
        try {
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
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitElseIfStmt(ElseIfStmtContext ctx, ASTNode parent) {
        try {
            ElseIfStmtNode node = new ElseIfStmtNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            node.children.add(visitLogStmt(ctx.logStmt(), node));
            ctx.stmt().forEach(child -> {
                stmtNode.children.add(visitStmt((StmtContext) child, node));
            });
            node.children.add(stmtNode);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        
    }

    public ASTNode visitElseStmt(ElseStmtContext ctx, ASTNode parent) {
        try {
            ElseStmtNode node = new ElseStmtNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            ctx.stmt().forEach(child -> {
                stmtNode.children.add(visitStmt((StmtContext) child, node));
            });
            node.children.add(stmtNode);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitLogStmt(LogStmtContext ctx, ASTNode parent) {
        try {
            LogicalExpressionNode node = new LogicalExpressionNode(parent);
            if(ctx.objFunccall() != null){
                node.children.add(visitObjFunccall(ctx.objFunccall(), node));
            } else {
                node.operator = getConvertedLogOp(ctx.logOp().getText());
                ctx.addexpr().forEach(child -> {
                    node.children.add(visitAddexpr((AddexprContext) child, node));
                });
            }
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public String getConvertedLogOp(String original){
        if(original.equalsIgnoreCase("and")){
            return " && ";
        } else if(original.equalsIgnoreCase("or")){
            return " || ";
        } else if(original.equalsIgnoreCase("equals")){
            return " == ";
        } else if(original.equalsIgnoreCase("not equals")){
            return " != ";
        } else {
            return " " + original + " ";
        }
    }

    public ASTNode visitVarDecl(VarDeclContext ctx, ASTNode parent) {
        try {
            String name = ctx.children.get(0).getClass().getSimpleName();
            VariableDeclarationNode node = new VariableDeclarationNode(parent);
            if(name.equalsIgnoreCase("ArrayContext")){
                node.children.add(visitArray((ArrayContext) ctx.children.get(0), node));
            }else{
                ASTNode type = visitType(ctx.TYPE().getText(), node, true);
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
        } catch (NullPointerException e) {
            
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }
    
    public ASTNode visitArray(ArrayContext ctx, ASTNode parent) {
        try {
            ArrayNode node = new ArrayNode(parent);

            ASTNode type = visitType(ctx.TYPE().getText(), node, false);
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
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    
    public ASTNode visitArrayval(ArrayvalContext ctx, ASTNode parent) {
        try {
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
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitExp(ExpContext ctx, ASTNode parent, ASTNode type) {
        try {
            ExpressionNode node = new ExpressionNode(parent);

            if(ctx.assignExp() != null){
                ASTNode assignExp = visitAssignExp((AssignExpContext)ctx.children.get(0), parent);
                node.children.add(assignExp);
            } else if(ctx.addexpr() != null){
                ASTNode addexpr = visitAddexpr((AddexprContext) ctx.children.get(0), parent);
                node.children.add(addexpr);
            } /*else if(ctx.getText().startsWith("NOT")){
                ASTNode exp = visitExp((ExpContext)ctx.children.get(1), node, null);
                node.children.add(exp);
            } else if(ctx.getText().startsWith("-")){
                ASTNode exp = visitExp((ExpContext)ctx.children.get(1), node, null);
                node.children.add(exp);
            }*/ else if(ctx.term() != null){
                ASTNode term = visitTerm((TermContext) ctx.children.get(0), node);
                node.children.add(term);
            } else {
                return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
            }

            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitTerm(TermContext ctx, ASTNode parent) {
        try {
            TermNode node = new TermNode(parent);

            if(ctx.ID() != null) {
                node.children.add(new IdentificationNode(node, ctx.ID().getText()));
            } else if(ctx.number() != null){
                return visitNumber((NumberContext) ctx.children.get(0), node);
                //node.children.add(number);
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
        } catch (NullPointerException e) {
            
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitNumber(NumberContext ctx, ASTNode parent) {
        try {
            NumberNode node = new NumberNode(parent);
            if(ctx.intLiteral() != null){
                return visitIntLiteral((IntLiteralContext) ctx.children.get(0), node);
                //node.children.add(intLit);
            } else if (ctx.floatLiteral() != null){
                return visitFloatLiteral((FloatLiteralContext) ctx.children.get(0), node);
                //node.children.add(fLit);
            } else {
                return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
            }

            //node.lineNumber = ctx.getStart().getLine();
            //node.charPosition = ctx.getStart().getCharPositionInLine();
            //return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitIntLiteral(IntLiteralContext ctx, ASTNode parent) {
        try {
            int value = Integer.parseInt(ctx.getText());
            IntLiteralNode node = new IntLiteralNode(parent, value);
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitFloatLiteral(FloatLiteralContext ctx, ASTNode parent) {
        try {
            float value = Float.parseFloat(ctx.getText());
            FloatLiteralNode node = new FloatLiteralNode(parent, value);

            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitFunccall(FunccallContext ctx, ASTNode parent) {
        try {
            FunctionCallNode node = new FunctionCallNode(parent);
            String id = ctx.ID().getText();
            node.children.add(new IdentificationNode(node, id));

            if(ctx.aParams() != null){
                ASTNode params = visitAParams((AParamsContext)ctx.children.get(2), node);
                node.children.add(params);
            }
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitAParams(AParamsContext ctx, ASTNode parent) {
        try {
            ActualParamsNode node = new ActualParamsNode(parent);

            ctx.exp().forEach(child -> {
                node.children.add(visitExp((ExpContext)ctx.exp(), node, null));
            });

            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitAddexpr(AddexprContext ctx, ASTNode parent) {
        try {
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
        } catch (NullPointerException e) {
            
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitMultexpr(MultexprContext ctx, ASTNode parent) {
        try {
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
        } catch (NullPointerException e) {
            
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitAssignExp(AssignExpContext ctx, ASTNode parent) {
        try {
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
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public ASTNode visitObjDecl(ObjDeclContext ctx, ASTNode parent) {
        try {
            ObjectDeclarationNode node = new ObjectDeclarationNode(parent);

            String id = ctx.ID().getText();
            int literal = Integer.parseInt(ctx.intLiteral().getText());

            node.children.add(new IdentificationNode(node, id));
            node.objId = getObjFuncId(ctx.OBJFUNCID().getText());
            node.children.add(new IntLiteralNode(node, literal));
            node.pinNumber = literal;
            AELCompiler.declaredObjects.put(id, literal); // we need this for code generation
            node.lineNumber = ctx.getStart().getLine();
            node.charPosition = ctx.getStart().getCharPositionInLine();
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());

        }
        
    }

    public String getObjFuncId(String id){
        if(id.equalsIgnoreCase("led")){
            return "OUTPUT";
        } else if(id.equalsIgnoreCase("button")){
            return "INPUT";
        } else {
            return "ERROR!";
        }
    }
     
    public ASTNode visitObjFuncId(String objId, ASTNode parent) {
        ObjFuncIdNode node = new ObjFuncIdNode(parent);
        if(objId.equalsIgnoreCase("led")){
            node.children.add(new LedNote(node));
            node.pinType = "led";
        } else if(objId.equalsIgnoreCase("button")) {
            node.children.add(new ButtonNode(node));
            node.pinType = "button";
        } else {
            return new ErrorNode(parent, "Error in ObjFuncId called at " + parent.getClass().getSimpleName());
        }
        return node;
    }
}
