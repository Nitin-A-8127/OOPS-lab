public class overloading{
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(10, 20));
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));

        calc.DecimalAddition(10.5, 20.5);
    }
}
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(double a, double b) {
        return a + b;
    }

    public void DecimalAddition(double x, double y) {
        double result = add(x, y);
        System.out.println("Sum of decimal numbers: " + result);
    }
}
