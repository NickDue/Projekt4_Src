import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ANTLR.AELLexer;
import ANTLR.AELParser;
import AST.ASTNode;
import CodeGeneration.CodeGenVisitor;
import SymbolTable.SymbolTable;
import semantics.visitors.ErrorVisitor;
import semantics.visitors.SemanticsVisitor;

public class AELCompiler {

    private enum CompilerArgs {
        inputFile,
        outputFile
    }

    public static void main(String[] args) {
        Hashtable<CompilerArgs, String> compilationParameters;

        if(args.length == 0){
            System.out.println("Missing arguments, no files created!");
        } else {
            try {
                compilationParameters = parseArgs(args);
                if(compilationParameters != null){
                    ASTNode DST = analyzeCode(compilationParameters.get(CompilerArgs.inputFile));
                    if(DST != null){
                        GenerateCode(DST, compilationParameters);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            
        }
        

    }

    private static Hashtable<CompilerArgs, String> parseArgs(String[] args) {
        Hashtable<CompilerArgs, String> compilationParameters = new Hashtable<>();
        
        for(int i = 0; i < args.length; i++){
            String in = parsePath(args[i]);
        }

        return compilationParameters;
    }

    private static String parsePath(String path) {  // TODO: Only works for windows. I think.
        if(path.contains(":")) {
            return path.replace('/', '\\');
        } else {
            return System.getProperty("user.dir") + "\\" + path.replace('/', '\\');
        }
    }


    private static ASTNode analyzeCode(String path){
        CharStream in;

        try {
            in = CharStreams.fromFileName(path);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        AELLexer lexer = new AELLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AELParser parser = new AELParser(tokens);
        ParseTree tree = parser.program();
        System.out.println(parser.program().getText());

        ASLBuilderVisitor astBuilder = new ASLBuilderVisitor();
        ASTNode node = astBuilder.visit(tree);

        SymbolTable symTable = new SymbolTable();
        node.accept(new SemanticsVisitor(symTable));
        ErrorVisitor errorVisitor = new ErrorVisitor();
        node.accept(errorVisitor);

        if(errorVisitor.hasErrors()){
            errorVisitor.printErrors();
            return null;
        }

        return node;
    }

    private static void GenerateCode(ASTNode DST, Hashtable<CompilerArgs, String> compilerParams){
        if(compilerParams.get(CompilerArgs.outputFile) == null)
            GenerateInoFile(DST, "ael-program");
        else 
            GenerateInoFile(DST, compilerParams.get(CompilerArgs.outputFile));
        
    }

    private static void GenerateInoFile(ASTNode DST, String filename){
        // TODO: Make a way to create a folder for it to be saved in
        try (PrintWriter out = new PrintWriter(filename + ".ino")) {
            out.println(new CodeGenVisitor().GenerateCode(DST));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
