class Student {

    int id;
    String name;
    int age;

    // Constructor 1: No parameters
    Student() {
        id = 101;
        name = "Unknown";
        age = 18;
    }

    // Constructor 2: One parameter
    Student(String studentName) {
        id = 102;
        name = studentName;
        age = 19;
    }

    // Constructor 3: Three parameters
    Student(int studentId, String studentName, int studentAge) {
        id = studentId;
        name = studentName;
        age = studentAge;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------");
    }
}

public class ConstructorOverloading{

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Rahul");

        Student s3 = new Student(103, "Sai", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}