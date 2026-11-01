
public class UncheckedExceptionCompleteDemo {

    public static void main(String[] args) {

        // 1. ArithmeticException
        System.out.println("1. ArithmeticException");

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero!");
        }


        // 2. NullPointerException
        System.out.println("\n2. NullPointerException");

        try {
            String name = null;

            System.out.println(name.length());

        } catch (NullPointerException e) {

            System.out.println("String reference is null!");
        }


        // 3. ArrayIndexOutOfBoundsException
        System.out.println("\n3. ArrayIndexOutOfBoundsException");

        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index!");
        }


        // 4. StringIndexOutOfBoundsException
        System.out.println("\n4. StringIndexOutOfBoundsException");

        try {
            String str = "Java";

            System.out.println(str.charAt(10));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Invalid String index!");
        }


        // 5. NumberFormatException
        System.out.println("\n5. NumberFormatException");

        try {
            String value = "Java";

            int number = Integer.parseInt(value);

            System.out.println(number);

        } catch (NumberFormatException e) {

            System.out.println("Cannot convert String to integer!");
        }


        // 6. ClassCastException
        System.out.println("\n6. ClassCastException");

        try {
            Object obj = "Hello";

            Integer number = (Integer) obj;

            System.out.println(number);

        } catch (ClassCastException e) {

            System.out.println("Invalid type casting!");
        }


        // 7. IllegalArgumentException
        System.out.println("\n7. IllegalArgumentException");

        try {
            setAge(-5);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }


        // 8. NegativeArraySizeException
        System.out.println("\n8. NegativeArraySizeException");

        try {
            int[] arr = new int[-5];

        } catch (NegativeArraySizeException e) {

            System.out.println("Array size cannot be negative!");
        }


        // 9. IndexOutOfBoundsException
        System.out.println("\n9. IndexOutOfBoundsException");

        try {
            java.util.ArrayList<Integer> list =
                    new java.util.ArrayList<>();

            list.add(10);
            list.add(20);

            System.out.println(list.get(5));

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Invalid list index!");
        }


        System.out.println("\nProgram completed successfully!");
    }


    // Method demonstrating IllegalArgumentException
    static void setAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException(
                    "Age cannot be negative!"
            );
        }

        System.out.println("Age: " + age);
    }
}
