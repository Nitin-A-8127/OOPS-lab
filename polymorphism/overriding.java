public class overriding {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println("Addition: " + c.add(10, 20));
        c.display();
        c.accessPrivate();

        System.out.println();

        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("Addition: " + ac.add(10, 20));
        ac.display();
        ac.show();

        System.out.println();

        Calculator ref = new AdvancedCalculator();
        System.out.println("Addition: " + ref.add(10, 20));
        ref.display();
        ref.accessPrivate();
    }
} 

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected void display() {
        System.out.println("This is Calculator class");
    }

    private void show() {
        System.out.println("Private method in Calculator");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {

    public int add(int a, int b) {
        return a + b + 10; 
    }

    public void display() {
        System.out.println("This is Advanced Calculator class");
    }

    public void show() {
        System.out.println("Show method in AdvancedCalculator");
    }
}

