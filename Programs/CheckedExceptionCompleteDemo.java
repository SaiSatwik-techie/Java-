
import java.io.*;

public class CheckedExceptionCompleteDemo {

    // 1. Checked exception using try-catch
    static void readFile() {

        try {
            FileReader reader = new FileReader("data.txt");

            System.out.println("File opened successfully!");

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {

            System.out.println("File reading error: " + e.getMessage());
        }
    }


    // 2. Checked exception using throws
    static void loadClass() throws ClassNotFoundException {

        Class.forName("StudentDetails");

        System.out.println("Class loaded successfully!");
    }


    // 3. Exception propagation using throws
    static void method3() throws InterruptedException {

        System.out.println("Inside method3");

        Thread.sleep(1000);

        System.out.println("Method3 completed");
    }

    static void method2() throws InterruptedException {

        System.out.println("Inside method2");

        method3();
    }

    static void method1() {

        try {
            System.out.println("Inside method1");

            method2();

        } catch (InterruptedException e) {

            System.out.println("Thread interrupted!");
            Thread.currentThread().interrupt();
        }
    }


    // 4. Custom checked exception
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                "Age must be 18 or above"
            );
        }

        System.out.println("Eligible!");
    }


    public static void main(String[] args) {

        System.out.println("1. File Exception");
        readFile();

        System.out.println("\n2. Class Exception");

        try {
            loadClass();

        } catch (ClassNotFoundException e) {

            System.out.println("Class not found!");
        }


        System.out.println("\n3. Exception Propagation");
        method1();


        System.out.println("\n4. Custom Checked Exception");

        try {
            checkAge(16);

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }


        // 5. Finally block
        System.out.println("\n5. Finally Block");

        try {
            int result = 10 / 2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic error");

        } finally {

            System.out.println("Finally block executed!");
        }
    }
}


// Custom checked exception class
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
