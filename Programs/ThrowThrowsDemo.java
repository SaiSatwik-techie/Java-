
class AgeValidator {

    // throws declares that this method may throw an exception
    static void checkAge(int age) throws ArithmeticException {

        if (age < 18) {

            // throw explicitly creates and throws an exception
            throw new ArithmeticException("Age must be 18 or above");

        } else {

            System.out.println("Eligible to vote");
        }
    }
}

public class ThrowThrowsDemo {

    public static void main(String[] args) {

        try {

            // Calling the method
            AgeValidator.checkAge(16);

        } catch (ArithmeticException e) {

            // Handling the exception
            System.out.println("Exception: " + e.getMessage());

        } finally {

            System.out.println("Age verification completed");
        }

        System.out.println("Program execution completed");
    }
}
