
class Parent {

    int number = 100;

    // Parent class constructor
    Parent() {
        System.out.println("Parent constructor called");
    }

    // Parent class method
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {

    int number = 200;

    // Child class constructor
    Child() {

        // Calling parent class constructor
        super();

        System.out.println("Child constructor called");
    }

    void show() {

        // Accessing parent class variable
        System.out.println("Parent variable: " + super.number);

        // Accessing child class variable
        System.out.println("Child variable: " + number);

        // Calling parent class method
        super.display();
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {

        Child obj = new Child();

        System.out.println();

        obj.show();
    }
}
