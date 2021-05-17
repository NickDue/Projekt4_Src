package SymbolTable;

import SymbolTable.attributes.Attributes;
import java.util.ArrayList;
import java.util.Hashtable;


public class SymbolTable {
    private final Hashtable<String, Attributes> symbols = new Hashtable<>();
    private final ArrayList<ArrayList<Attributes>> scopes = new ArrayList<>();
    private int depth = -1;

    public SymbolTable() {}

    public void enterSymbol(String name, Attributes attr) {
        // Add to scope display
        attr.name = name;
        attr.level = scopes.get(depth);
        attr.depth = depth;
        attr.formalParamsCount = attr.formalParamsCount;
        scopes.get(depth).add(attr);

        // Add to hashtable
      
    }

    public Attributes retrieveSymbol(String name) {
        return symbols.get(name);
    }

    public boolean declaredLocally(String name) {
        Attributes sym = retrieveSymbol(name);      // Retrieves the symbol
        return sym != null && sym.depth == depth;   // If a symbol is found and is at the same (continued below)
    }                                               // nesting depth it has already been declared.

    public void openScope() {
        depth++;
        if (scopes.size() - 1 < depth) {
            scopes.add(new ArrayList<>());
        }
    }

    // fjerne var, tilføje level
    public void closeScope() {
        Attributes prevSym;
        ArrayList<Attributes> currentScope = scopes.get(depth);
        for (int i = 0; i < currentScope.size(); i++) {        // Iterate through all symbols in this scope
            prevSym = currentScope.get(i).var;                 // Get an earlier declaration with the same name
            symbols.remove(currentScope.get(i).name);          // Remove the current symbol from the symbol table as it cannot be accessed outside the scope
            if(prevSym != null) {                              // If another declaration of same name was found
                enterSymbol(prevSym.name, prevSym);            // Add the symbol to the list
            }
        }
        scopes.remove(depth);
        depth--;
    }
}