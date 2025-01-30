import Chapter9.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator objcalculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(15, objcalculator.sum(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, objcalculator.multiply(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, objcalculator.subtract(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, objcalculator.divide(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        objcalculator.divide(10, 0);
    }
}
