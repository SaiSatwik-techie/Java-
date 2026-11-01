
public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;


        // =====================================
        // 1. ARITHMETIC OPERATORS
        // =====================================

        // Used to perform mathematical operations.

        System.out.println("ARITHMETIC OPERATORS");

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


        // =====================================
        // 2. ASSIGNMENT OPERATORS
        // =====================================

        // Used to assign or update variable values.

        System.out.println("\nASSIGNMENT OPERATORS");

        int x = 10;

        x += 5;  // x = x + 5
        System.out.println("After += : " + x);

        x -= 3;  // x = x - 3
        System.out.println("After -= : " + x);

        x *= 2;  // x = x * 2
        System.out.println("After *= : " + x);

        x /= 4;  // x = x / 4
        System.out.println("After /= : " + x);

        x %= 3;  // x = x % 3
        System.out.println("After %= : " + x);


        // =====================================
        // 3. RELATIONAL OPERATORS
        // =====================================

        // Used to compare two values.
        // Result will always be true or false.

        System.out.println("\nRELATIONAL OPERATORS");

        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Less Than: " + (a < b));
        System.out.println("Greater or Equal: " + (a >= b));
        System.out.println("Less or Equal: " + (a <= b));


        // =====================================
        // 4. LOGICAL OPERATORS
        // =====================================

        // Used to combine or reverse conditions.

        System.out.println("\nLOGICAL OPERATORS");

        int age = 20;
        boolean hasID = true;

        System.out.println("AND: " + (age >= 18 && hasID));
        System.out.println("OR: " + (age >= 18 || hasID));
        System.out.println("NOT: " + (!hasID));


        // =====================================
        // 5. UNARY OPERATORS
        // =====================================

        // Operate on a single operand.

        System.out.println("\nUNARY OPERATORS");

        int n = 10;

        System.out.println("Positive: " + (+n));
        System.out.println("Negative: " + (-n));

        boolean status = true;

        System.out.println("Logical NOT: " + (!status));

        System.out.println("Bitwise Complement: " + (~n));


        // =====================================
        // 6. INCREMENT AND DECREMENT
        // =====================================

        // ++ increases value by 1.
        // -- decreases value by 1.

        System.out.println("\nINCREMENT AND DECREMENT");

        int num = 5;

        System.out.println("Original: " + num);

        System.out.println("Pre Increment: " + (++num));
        System.out.println("Post Increment: " + (num++));
        System.out.println("After Post Increment: " + num);

        System.out.println("Pre Decrement: " + (--num));
        System.out.println("Post Decrement: " + (num--));
        System.out.println("After Post Decrement: " + num);


        // =====================================
        // 7. BITWISE OPERATORS
        // =====================================

        // Perform operations on individual bits.

        System.out.println("\nBITWISE OPERATORS");

        int p = 5;  // Binary: 0101
        int q = 3;  // Binary: 0011

        System.out.println("Bitwise AND: " + (p & q));
        System.out.println("Bitwise OR: " + (p | q));
        System.out.println("Bitwise XOR: " + (p ^ q));
        System.out.println("Bitwise Complement: " + (~p));


        // =====================================
        // 8. SHIFT OPERATORS
        // =====================================

        // Shift the bits of a number.

        System.out.println("\nSHIFT OPERATORS");

        int value = 8; // Binary: 1000

        System.out.println("Left Shift: " + (value << 1));
        System.out.println("Right Shift: " + (value >> 1));
        System.out.println("Unsigned Right Shift: " + (value >>> 1));


        // =====================================
        // 9. TERNARY OPERATOR
        // =====================================

        // Short form of if-else.

        System.out.println("\nTERNARY OPERATOR");

        int marks = 75;

        String result = (marks >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);


        // =====================================
        // 10. INSTANCEOF OPERATOR
        // =====================================

        // Checks whether an object belongs to a type.

        System.out.println("\nINSTANCEOF OPERATOR");

        String name = "Satwik";

        System.out.println(name instanceof String);

    }
}
