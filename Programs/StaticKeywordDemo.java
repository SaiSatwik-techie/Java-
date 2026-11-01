class Student {

    // Instance variables: Every object gets its own copy
    int id;
    String name;

    // Static variables: Shared by all objects
    static String college;
    static int count;

    // 1. Static block
    static {
        college = "AANM & VVRSR POLYTECHNIC College";
        count = 0;

        System.out.println("Static block executed");
    }

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;

        count++;
    }

    // Instance method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("--------------------");
    }

    // 2. Static method
    static void displayCount() {
        System.out.println("Total Students: " + count);
        System.out.println("College Name: " + college);
    }
}

public class StaticKeywordDemo {

    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student(101, "Sai");

        // Creating second object
        Student s2 = new Student(102, "Rahul");

        // Calling instance methods
        s1.display();
        s2.display();

        // Calling static method using class name
        Student.displayCount();

        // Modifying the shared static variable
        Student.college = "RVR & JC Engineering College";

        System.out.println("\nAfter changing college name:");

        s1.display();
        s2.display();

        Student.displayCount();
    }
}