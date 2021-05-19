package Tests.Unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import compiler.AELCompiler;


public class AELCompilerUnitTest {

    @Test
    public void Main_ThrowsErrorWithLessThan2Arguments(){
        String inputFiles[] = {"CompilerTests/LoopLock.ael LoopLockArduino"};
        Assertions.assertThrows(RuntimeException.class, () -> {
           AELCompiler.main(inputFiles);
        });
    } 
    @Test
    public void Main_ThrowsErrorWithMoreThan2Arguments(){
        String inputFiles[] = {"CompilerTests/LoopLock.ael LoopLockArduino", "other/filePath","Third/filepat"};
        Assertions.assertThrows(RuntimeException.class, () -> {
           AELCompiler.main(inputFiles);
        });
    }    
    
     


}


