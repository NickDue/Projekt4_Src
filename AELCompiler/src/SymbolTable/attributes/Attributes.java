package SymbolTable.attributes;

import java.util.ArrayList;

public abstract class Attributes {
    public String name;
    public AttributeKind kind;
    public ArrayList<Attributes> level;
    public Attributes var; // TODO: Redo
    public int depth;
    public int pinNumber;
    public ObjectKind objectKind;
    public int formalParamsCount;

    public Attributes() { }

    public Attributes(String name) {
        this.name = name;
    }

    public Attributes(String name, AttributeKind kind) {
        this(name);
        this.kind = kind;
    }
}