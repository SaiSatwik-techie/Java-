public class StringMethodsDemo {

    public static void main(String[] args) {

        String str = "Java Programming";
        String text = "  Hello Java  ";

        // 1. length() - Returns the number of characters
        System.out.println("Length: " + str.length());

        // 2. charAt() - Returns character at specified index
        System.out.println("Character at index 2: " + str.charAt(2));

        // 3. toUpperCase() - Converts to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. toLowerCase() - Converts to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. substring() - Extracts part of a string
        System.out.println("Substring: " + str.substring(5));
        System.out.println("Substring (0 to 4): " + str.substring(0, 4));

        // 6. contains() - Checks whether text exists
        System.out.println("Contains Java: " + str.contains("Java"));

        // 7. startsWith() - Checks starting characters
        System.out.println("Starts with Java: " + str.startsWith("Java"));

        // 8. endsWith() - Checks ending characters
        System.out.println("Ends with ing: " + str.endsWith("ing"));

        // 9. indexOf() - Returns first occurrence index
        System.out.println("Index of a: " + str.indexOf('a'));

        // 10. lastIndexOf() - Returns last occurrence index
        System.out.println("Last index of a: " + str.lastIndexOf('a'));

        // 11. replace() - Replaces characters or text
        System.out.println("Replace: " + str.replace("Java", "Python"));

        // 12. equals() - Compares string contents
        System.out.println("Equals: " + str.equals("Java Programming"));

        // 13. equalsIgnoreCase() - Compares ignoring case
        System.out.println("Ignore case: " + str.equalsIgnoreCase("JAVA PROGRAMMING"));

        // 14. compareTo() - Lexicographically compares strings
        System.out.println("Compare: " + "Apple".compareTo("Banana"));

        // 15. concat() - Joins two strings
        System.out.println("Concat: " + "Hello ".concat("World"));

        // 16. trim() - Removes leading and trailing spaces
        System.out.println("Trim: '" + text.trim() + "'");

        // 17. isEmpty() - Checks whether length is zero
        System.out.println("Is empty: " + "".isEmpty());

        // 18. isBlank() - Checks whether empty or only whitespace (Java 11+)
        System.out.println("Is blank: " + "   ".isBlank());

        // 19. split() - Splits string into an array
        String[] words = str.split(" ");

        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 20. toCharArray() - Converts string into character array
        char[] characters = str.toCharArray();

        System.out.println("Characters:");
        for (char ch : characters) {
            System.out.print(ch + " ");
        }

        System.out.println();

        // 21. valueOf() - Converts other data types into String
        int number = 100;
        String converted = String.valueOf(number);
        System.out.println("Converted number: " + converted);

        // 22. join() - Joins multiple strings using a delimiter
        String result = String.join("-", "Java", "Python", "C");
        System.out.println("Join: " + result);

        // 23. repeat() - Repeats a string (Java 11+)
        System.out.println("Repeat: " + "Hi ".repeat(3));

        // 24. replaceAll() - Replaces text using a regular expression
        String digits = "Java123Programming456";
        System.out.println("Remove digits: " + digits.replaceAll("[0-9]", ""));

        // 25. strip() - Removes leading and trailing Unicode whitespace (Java 11+)
        System.out.println("Strip: '" + "   Hello Java   ".strip() + "'");

        // 26. matches() - Checks whether entire string matches a regex
        System.out.println("Only digits: " + "12345".matches("[0-9]+"));

        // 27. toString() - Returns the string representation
        System.out.println("ToString: " + str.toString());

        // 28. Demonstrating String immutability
        String original = "Java";
        original.concat(" Programming");

        System.out.println("Original after concat: " + original);

        original = original.concat(" Programming");

        System.out.println("Original after reassignment: " + original);
    }
}