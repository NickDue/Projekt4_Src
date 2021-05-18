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
        System.out.println("running");
        if(args.length != 2){
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
        System.out.println("Entered ParseArgs()");

        String in = parsePath(args[0]);
        if(!(new File(in).exists())) {
            System.out.println("ERROR: FILE DOES NOT EXIST: " + in);
            return null;
        } else if(!in.endsWith(".ael")) {
            System.out.println("ERROR: WRONG EXTENSION in: " + in);
            return null;
        } else {
            compilationParameters.put(CompilerArgs.inputFile, in);
        }

        String name = args[1];
        compilationParameters.put(CompilerArgs.outputFile, name);
        
        System.out.println("Exiting ParseArgs()");
        return compilationParameters;
    }

    private static String parsePath(String path) {  // TODO: This should only work for windows I think
        System.out.println("Entered parsePath()");
        if(path.contains(":")) {
            return path.replace('/', '\\');
        } else {
            return System.getProperty("user.dir") + "\\" + path.replace('/', '\\');
        }
    }


    private static ASTNode analyzeCode(String path){
        CharStream in;
        System.out.println("Entered analyzeCode()");
        try {
            in = CharStreams.fromFileName(path);
        } catch (IOException e) {
            System.out.println("Error in creation of CharStream in AnalyzeCode");
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
        System.out.println("Exiting analyzeCode()");
        return node;
    }

    private static void GenerateCode(ASTNode DST, Hashtable<CompilerArgs, String> compilerParams){
        System.out.println("Entered GenerateCode()");
        if(compilerParams.get(CompilerArgs.outputFile) == null)
            GenerateInoFile(DST, "ael-program");
        else 
            GenerateInoFile(DST, compilerParams.get(CompilerArgs.outputFile));
        System.out.println("Exiting GenerateCode()");
    }

    private static void GenerateInoFile(ASTNode DST, String filename){
        System.out.println("Entered GenerateInoFile()");
        // TODO: Make a way to create a folder for it to be saved in
        try (PrintWriter out = new PrintWriter(filename + ".ino")) {
            out.println(new CodeGenVisitor().GenerateCode(DST));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Exiting GenerateInoFile()");
    }

}
