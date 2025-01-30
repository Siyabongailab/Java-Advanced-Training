package Chapter9;


public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator objcalculator = new Calculator();

        System.out.println("Sum: " + objcalculator.sum(10, 5));
        System.out.println("Multiply: " + objcalculator.multiply(10, 5));
        System.out.println("Subtract: " + objcalculator.subtract(10, 5));

        try {
            System.out.println("Divide: " + objcalculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
