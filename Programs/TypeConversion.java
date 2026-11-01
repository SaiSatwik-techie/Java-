
public class TypeConversion {

    public static void main(String[] args) {

        // =====================================
        // 1. WIDENING TYPE CONVERSION
        // =====================================

        // Converting a smaller data type into
        // a larger compatible data type.
        // Java performs this automatically.

        System.out.println("WIDENING TYPE CONVERSION");

        // int to long
        int a = 100;
        long b = a;

        System.out.println("Int value: " + a);
        System.out.println("Long value: " + b);


        // int to double
        int num = 50;
        double decimal = num;

        System.out.println("\nInt value: " + num);
        System.out.println("Double value: " + decimal);


        // float to double
        float f = 25.5f;
        double d = f;

        System.out.println("\nFloat value: " + f);
        System.out.println("Double value: " + d);


        // =====================================
        // 2. NARROWING TYPE CONVERSION
        // =====================================

        // Converting a larger data type into
        // a smaller data type.
        // Requires explicit type casting.

        System.out.println("\nNARROWING TYPE CONVERSION");

        // double to int
        double x = 99.99;
        int y = (int) x;

        System.out.println("Double value: " + x);
        System.out.println("Int value: " + y);


        // int to byte
        int number = 130;
        byte small = (byte) number;

        System.out.println("\nInt value: " + number);
        System.out.println("Byte value: " + small);


        // double to float
        double price = 123.456789;
        float convertedPrice = (float) price;

        System.out.println("\nDouble value: " + price);
        System.out.println("Float value: " + convertedPrice);


        // =====================================
        // 3. TYPE PROMOTION IN EXPRESSIONS
        // =====================================

        // byte, short and char are promoted
        // to int during arithmetic operations.

        System.out.println("\nTYPE PROMOTION");

        byte n1 = 10;
        byte n2 = 20;

        int result = n1 + n2;

        System.out.println("Result: " + result);


        // =====================================
        // 4. CHAR TO INT CONVERSION
        // =====================================

        // char can be converted into int.
        // It gives the Unicode value of the character.

        System.out.println("\nCHAR TO INT");

        char ch = 'A';
        int ascii = ch;

        System.out.println("Character: " + ch);
        System.out.println("Numeric value: " + ascii);


        // =====================================
        // 5. INT TO CHAR CONVERSION
        // =====================================

        int value = 66;
        char character = (char) value;

        System.out.println("\nINT TO CHAR");

        System.out.println("Integer: " + value);
        System.out.println("Character: " + character);


        // =====================================
        // 6. STRING TO INT CONVERSION
        // =====================================

        // String is not a primitive data type.
        // parseInt() converts a numeric String into int.

        System.out.println("\nSTRING TO INT");

        String str = "500";
        int converted = Integer.parseInt(str);

        System.out.println("String: " + str);
        System.out.println("Integer: " + converted);


        // =====================================
        // 7. INT TO STRING CONVERSION
        // =====================================

        // String.valueOf() converts a value into String.

        System.out.println("\nINT TO STRING");

        int marks = 95;
        String marksString = String.valueOf(marks);

        System.out.println("Integer: " + marks);
        System.out.println("String: " + marksString);

    }
}
