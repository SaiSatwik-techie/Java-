
public class MultipleCatchDemo {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        int[] numbers = {10, 20, 30};

        try {
            int result = a / b;
            System.out.println("Result: " + result);

            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index");

        } catch (Exception e) {
            System.out.println("Some other exception occurred");
        }

        System.out.println("Program completed");
    }
}
