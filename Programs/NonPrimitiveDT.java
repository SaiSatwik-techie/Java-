
public class NonPrimitiveDT {

    public static void main(String[] args) {

        // 1. STRING
        // Stores a sequence of characters.

        String name = "Satwik";

        System.out.println("String: " + name);


        // 2. ARRAY
        // Stores multiple values of the same data type.

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\nArray:");

        for (int num : numbers) {
            System.out.println(num);
        }


        // 3. CLASS AND OBJECT
        // Student is a class.
        // student1 is an object of Student.

        Student student1 = new Student();

        student1.name = "Rahul";
        student1.age = 20;

        System.out.println("\nObject:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);


        // 4. ENUM
        // Enum represents a fixed set of constants.

        Day today = Day.SUNDAY;

        System.out.println("\nEnum: " + today);


    }
}


// CLASS
class Student {
    String name;
    int age;
}


// ENUM
enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
