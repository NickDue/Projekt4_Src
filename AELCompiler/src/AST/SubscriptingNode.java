package AST;

import java.util.ArrayList;

import AST.visitors.IVisitor;

public class SubscriptingNode extends ASTNode {

    public ArrayList<Integer> index;

    public SubscriptingNode(ASTNode parent, String str) {
        super(parent);
        String delimiters = "[,]+";
        String[] tokens = str.split(delimiters);
        index = new ArrayList<>();
        tokens[0] = tokens[0].replace("[","");
        tokens[tokens.length - 1] = tokens[tokens.length - 1].replace("]","");
        for (String s: tokens) {
            if (!s.equals("")) {
                try {
                    index.add(Integer.parseInt(s));
                } catch (Exception e) {
                    System.out.println("Error while parsing subscript notation");
                }
            }
        }
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    
}
