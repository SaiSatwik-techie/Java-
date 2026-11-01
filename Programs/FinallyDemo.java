
public class FinallyDemo {
    public static void main(String[] args) {

        // Case 1: No exception
        try {
            int result = 20 / 5;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (Case 1)");
        }

        // Case 2: Exception occurs
        try {
            int result = 20 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (Case 2)");
        }

        System.out.println("Program completed");
    }
}
