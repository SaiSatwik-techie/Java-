class Parent {

    // Final variable
    final int MAX_MARKS = 100;

    // Final method
    final void display() {
        System.out.println("This is a final method");
    }

    void show() {
        System.out.println("This is a normal method");
    }
}

// Child class inherits Parent
class Child extends Parent {

    void displayDetails() {
        System.out.println("Maximum Marks: " + MAX_MARKS);

        // Calling inherited final method
        display();

        // Calling normal inherited method
        show();
    }
}

// Final class
final class Vehicle {

    void start() {
        System.out.println("Vehicle started");
    }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {

        // Final variable
        final int age = 20;

        System.out.println("Age: " + age);

        // age = 25; // Compilation error

        // Creating child object
        Child obj = new Child();

        obj.displayDetails();

        // Creating final class object
        Vehicle v = new Vehicle();

        v.start();
    }
}