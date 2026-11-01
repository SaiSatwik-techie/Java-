class Person {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    int rollNumber;

    void study() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println(name + " is studying");
    }
}

public class SingleInheritanceDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Sai";
        s1.age = 20;
        s1.rollNumber = 101;

        s1.displayDetails();
        s1.study();
    }
}