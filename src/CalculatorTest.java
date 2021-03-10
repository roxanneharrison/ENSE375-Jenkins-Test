/*----------------------------------------------------------------------------*\
     ___ _  _ ___ ___   ________ ___         _    ___         ___      ___ 
    | __| \| / __| __| |__ /__  | __|  ___  | |  |_  )  ___  | __|__ _|_  )
    | _|| .` \__ \ _|   |_ \ / /|__ \ |___| | |__ / /  |___| | _|/ _` |/ / 
    |___|_|\_|___/___| |___//_/ |___/       |____/___|       |___\__, /___|
                                                                 |___/     
                              CalculatorTest.java
                                  Adam Tilson
                                   Jan, 2021

    This application demonstrates a simple test for an external class.
    
    Compile and Run: See the included readme.md for compilation commands
\*----------------------------------------------------------------------------*/
import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    @Test
    public void Add_SimpleAddition_ReturnSum() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(result, 7);
    }
}
