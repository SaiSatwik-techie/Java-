class Student {

    int id;
    String name;
    String city;

    // 1. Using this to refer to current object's variables
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.city = "Not Assigned";
    }

    // 2. Using this() to call another constructor
    Student() {
        this(101, "Unknown");
    }

    // 3. Using this to call another method of the current object
    void display() {
        this.showDetails();
    }

    void showDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("City: " + this.city);
    }

    // 4. Passing the current object as an argument
    void sendDetails() {
        StudentInfo.print(this);
    }

    // 5. Returning the current object
    Student updateCity(String city) {
        this.city = city;
        return this;
    }
}

// Another class to receive the Student object
class StudentInfo {

    static void print(Student student) {
        System.out.println("\nStudent details received:");
        System.out.println("Name: " + student.name);
        System.out.println("City: " + student.city);
    }
}

public class ThisKeywordDemo {

    public static void main(String[] args) {

        // Creating an object using the no-argument constructor
        Student s1 = new Student();

        System.out.println("Initial Details:");
        s1.display();

        // Updating city and returning the same object
        s1.updateCity("Vijayawada");

        System.out.println("\nUpdated Details:");
        s1.display();

        // Passing the current object
        s1.sendDetails();

        // Creating another object using parameterized constructor
        Student s2 = new Student(102, "Rahul");

        System.out.println("\nSecond Student:");
        s2.display();
    }
}