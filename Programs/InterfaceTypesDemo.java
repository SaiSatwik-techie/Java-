
// 1. Normal Interface
// Contains multiple abstract methods
interface NormalInterface {
    void display();
    void show();
}

// 2. Functional Interface
// Contains exactly one abstract method
//@FunctionalInterface is optional, but it helps the compiler verify that exactly one abstract method is declared.
@FunctionalInterface
interface FunctionalInterfaceEX {
    void calculate();
}

// 3. Marker Interface
// Contains no methods
interface MarkerInterface {
}

// Class implementing all three interfaces
class Demo implements NormalInterface, FunctionalInterfaceEX, MarkerInterface {

    // Implementing NormalInterface methods
    public void display() {
        System.out.println("Normal Interface: display method");
    }

    public void show() {
        System.out.println("Normal Interface: show method");
    }

    // Implementing FunctionalInterface method
    public void calculate() {
        System.out.println("Functional Interface: calculate method");
    }
}

public class InterfaceTypesDemo {

    public static void main(String[] args) {

        Demo obj = new Demo();

        // Normal Interface
        System.out.println("NORMAL INTERFACE");
        obj.display();
        obj.show();

        // Functional Interface
        System.out.println("\nFUNCTIONAL INTERFACE");
        obj.calculate();

        // Marker Interface
        System.out.println("\nMARKER INTERFACE");
        System.out.println("Demo implements MarkerInterface");
    }
}
