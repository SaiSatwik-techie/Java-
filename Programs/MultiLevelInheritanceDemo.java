
class Animal {

    void eat() {
        System.out.println("Animal eats food.");
    }

    void sleep() {
        System.out.println("Animal sleeps.");
    }
}

class Mammal extends Animal {

    void walk() {
        System.out.println("Mammals can walk.");
    }
}

class Dog extends Mammal {

    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    void displayInfo() {
        System.out.println("----- Dog Information -----");
        eat();
        sleep();
        walk();
        bark();
    }
}

public class MultiLevelInheritanceDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.displayInfo();
    }
}
