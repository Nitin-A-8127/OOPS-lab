class MathOperations {
    public void safeDivide(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        } finally {
            System.out.println("Division attempt finished.");
        }
    }
}

public class exception {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        math.safeDivide(10, 0);
    }
}