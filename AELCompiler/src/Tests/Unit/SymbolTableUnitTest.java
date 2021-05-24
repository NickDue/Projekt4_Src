package Tests.Unit;


import SymbolTable.SymbolTable;
import SymbolTable.attributes.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class SymbolTableUnitTest {
    SymbolTable symT;
    String name;
    String fakeName;
    TypeAttributes attr;

    @BeforeEach
    public void setup(){
        this.symT = new SymbolTable();
        attr = new TypeAttributes();
        name = "TestName";
        fakeName = "TstNme";
        attr.depth = 2;
        attr.kind = AttributeKind.variableAttributes;  
        symT.enterSymbol(name, attr);
    }

    @Test
    public void TestNameSymbolTable(){
        Assert.assertEquals(name, symT.retrieveSymbol("TestName").name);
        Assert.assertNotEquals(fakeName, symT.retrieveSymbol("TestName").name);
    }

    @Test
    public void TestDepthSymbolTable(){
        Assert.assertEquals(2, symT.retrieveSymbol("TestName").depth);
        Assert.assertNotEquals(3, symT.retrieveSymbol("TestName").depth);
    }
    
    @Test
    public void TestAttrKindSymbolTable(){
        Assert.assertEquals(AttributeKind.variableAttributes, attr.kind);
        Assert.assertNotEquals(AttributeKind.typeAttributes, attr.kind);
    }
}
