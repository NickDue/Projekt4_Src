import java.lang.reflect.Field;

public class AELCompiler {
    public static void main(String[] args) throws Exception {
        AELCompiler t = new AELCompiler();
        t.getClassName();
        t.getAttributes();
    }

    int x;
    int y;  

    public String getClassName() {

        String className = this.getClass().getSimpleName(); 
        System.out.println("Name:" + className);
        return className;
    }

    public Field[] getAttributes() {

        Field[] attributes = this.getClass().getDeclaredFields();   
        for(int i = 0; i < attributes.length; i++) {
            System.out.println("Declared Fields" + attributes[i]);    
        }

        return attributes;
    }
}
