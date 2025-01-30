import Chapter9.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator objcalculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(15, objcalculator.sum(5, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, objcalculator.multiply(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, objcalculator.subtract(9, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, objcalculator.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, ()-> {
            objcalculator.divide(10, 0);
        });

    }
}
