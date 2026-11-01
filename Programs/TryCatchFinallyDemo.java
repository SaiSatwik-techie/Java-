
public class TryCatchFinallyDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        // try block contains code that may cause an exception
        try {

            int result = a / b;

            System.out.println("Result: " + result);

        }

        // catch block handles the exception
        catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero");

            // Displays the exception message
            System.out.println("Exception: " + e.getMessage());

        }

        // finally block executes whether an exception occurs or not
        finally {

            System.out.println("Finally block executed");

        }

        // Program continues after exception handling
        System.out.println("Program execution completed");
    }
}
