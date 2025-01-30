public class Calculator {
    // Method to add two numbers
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 -num2;
    }

    // Method to divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
