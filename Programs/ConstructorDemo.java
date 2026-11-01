class Student {

    int id;
    String name;

    // 1. No-argument constructor
    Student() {
        id = 101;
        name = "Satwik";
    }

    // 2. Parameterized constructor
    Student(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("----------------");
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        // Calls no-argument constructor
        Student s1 = new Student();

        // Calls parameterized constructor
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();
    }
}