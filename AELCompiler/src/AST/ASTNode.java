package AST;

import java.util.ArrayList;
import java.util.List;

import AST.visitors.IVisitor;
import SymbolTable.typeDescriptors.TypeDescriptor;

public abstract class ASTNode {
    public ASTNode parent;
    public TypeDescriptor type;
    public List<ASTNode> children;
    public boolean isReachable;
    public boolean terminatesNormally;
    public int lineNumber;
    public int charPosition;

    public ASTNode(ASTNode parentNode){
        parent = parentNode;
        children = new ArrayList<ASTNode>();
    }

    public abstract void accept(IVisitor visitor);
}
