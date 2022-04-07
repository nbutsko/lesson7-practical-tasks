import calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {

    private Calculator calculator;

    @BeforeEach
    public void createCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void testAdditionOfTwoIntegers(){
        assertEquals(10, calculator.addTwoIntegers(6,4));
    }

    @Test
    public void testMultiplicationOfTwoIntegers(){
        assertEquals(10, calculator.multiplyTwoIntegers(2,5));
    }
}
