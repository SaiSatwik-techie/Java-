
public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // 1. BYTE
        // Size: 1 byte
        // Range: -128 to 127
        byte age = 20;
        System.out.println("Byte value: " + age);


        // 2. SHORT
        // Size: 2 bytes
        short year = 2026;
        System.out.println("Short value: " + year);


        // 3. INT
        // Size: 4 bytes
        int salary = 50000;
        System.out.println("Int value: " + salary);


        // 4. LONG
        // Size: 8 bytes
        // Use L at the end of the value.
        long population = 9876543210L;
        System.out.println("Long value: " + population);


        // 5. FLOAT
        // Size: 4 bytes
        // Use f at the end of the value.
        float price = 99.50f;
        System.out.println("Float value: " + price);


        // 6. DOUBLE
        // Size: 8 bytes
        double percentage = 89.5678;
        System.out.println("Double value: " + percentage);


        // 7. CHAR
        // Size: 2 bytes
        // Stores a single UTF-16 code unit.
        // Use single quotes.
        char grade = 'A';
        System.out.println("Char value: " + grade);


        // 8. BOOLEAN
        // Stores true or false.
        boolean isPassed = true;
        System.out.println("Boolean value: " + isPassed);


        // VARIABLES

        // Variable declaration
        int number;

        // Variable initialization
        number = 100;

        // Variable reassignment
        number = 200;

        System.out.println("Updated number: " + number);


        // Multiple variables of the same data type
        int a = 10, b = 20, c = 30;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);


        // Constant variable using final
        final double PI = 3.14159;

        System.out.println("PI: " + PI);

    }
}
