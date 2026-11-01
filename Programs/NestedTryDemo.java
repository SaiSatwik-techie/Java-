
public class NestedTryDemo {
    public static void main(String[] args) {

        try {
            System.out.println("Outer try block started");

            int a = 20;
            int b = 0;

            try {
                System.out.println("Inner try block started");

                int result = a / b;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index");
        }

        System.out.println("Program completed");
    }
}
