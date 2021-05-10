package AST;

public class LedNote extends ObjIdNode {

    public LedNote(ASTNode parentNode) {
        super(parentNode);
        this.objType = "LED";
    }
}
