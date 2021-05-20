package Tests.Unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import compiler.AELCompiler;


public class AELCompilerUnitTest {

    @Test
    @DisplayName("Main: Throws Error when given less than 2 filepaths")
    public void Main_ThrowsErrorWithLessThan2Arguments(){
        String inputFiles[] = {"CompilerTests/LoopLock.ael LoopLockArduino"};
        Assertions.assertThrows(RuntimeException.class, () -> {
           AELCompiler.main(inputFiles);
        });
    } 
    @Test
    @DisplayName("Main: Throws Error when given more than 2 filepaths")
    public void Main_ThrowsErrorWithMoreThan2Arguments(){
        String inputFiles[] = {"CompilerTests/LoopLock.ael LoopLockArduino", "other/filePath","Third/filepat"};
        Assertions.assertThrows(RuntimeException.class, () -> {
           AELCompiler.main(inputFiles);
        });
    }
}


