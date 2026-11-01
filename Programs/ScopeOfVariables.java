
class Student {

    // 1. INSTANCE VARIABLE
    // Declared inside a class but outside methods.
    // Each object gets its own copy.
    // Exists as long as its object is reachable
    // (until it becomes eligible for garbage collection).

    String name = "Satwik";


    // 2. STATIC VARIABLE
    // Declared using static keyword.
    // Shared by all objects of this class.
    // Exists while the class is loaded.

    static String college = "ABC College";


    void display() {

        // 3. LOCAL VARIABLE
        // Declared inside a method.
        // Accessible only inside that method.
        // Exists during execution of this method call.

        int age = 20;

        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Age: " + age);
    }
}


public class ScopeOfVariables {

    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();

        // Creating second object
        Student s2 = new Student();

        // Accessing instance variables
        s1.name = "Satwik";
        s2.name = "Rahul";

        // Accessing static variable
        Student.college = "XYZ College";

        System.out.println("First Student:");
        s1.display();

        System.out.println("\nSecond Student:");
        s2.display();

    }
}
