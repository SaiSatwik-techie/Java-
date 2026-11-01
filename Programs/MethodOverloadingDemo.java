
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition Operations");

        System.out.println("Two integers: " + calc.add(10, 20));

        System.out.println("Three integers: " + calc.add(10, 20, 30));

        System.out.println("Two doubles: " + calc.add(10.5, 20.5));

        System.out.println("Integer and double: " + calc.add(10, 20.5));

        System.out.println("Double and integer: " + calc.add(10.5, 20));

        System.out.println("\nMultiplication Operations");

        System.out.println("Two integers: " + calc.multiply(5, 4));

        System.out.println("Three integers: " + calc.multiply(5, 4, 2));

        System.out.println("Two doubles: " + calc.multiply(2.5, 4.0));
    }
}
