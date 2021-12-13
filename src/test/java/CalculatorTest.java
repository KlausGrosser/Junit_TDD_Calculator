import main.java.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void init(){
        calculator = new Calculator();
    }


    @Test
    public void verifyAddition() {
        //TODO
        assertEquals(25,calculator.addition(20,5));
    }


    @Test
    public void verifySubtraction() {
        //TODO
        assertEquals(5,calculator.subtract(25,20));
    }


    @Test
    public void verifyMultiplication() {
        //TODO
        assertEquals(500,calculator.multiply(25,20));
    }

    @Test
    public void verifyDivision() {
        //TODO
        assertEquals(10,calculator.division(100,10));
    }


    @Test
    public void verifyDivisionByZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(5, 0);
        });
        //TODO
    }
}
