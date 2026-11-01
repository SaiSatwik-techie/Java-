
class Animal {

    void eat() {
        System.out.println("Animal eats food.");
    }

    void sleep() {
        System.out.println("Animal sleeps.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

class Cow extends Animal {

    void sound() {
        System.out.println("Cow says: Moo! Moo!");
    }
}

public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("----- Dog -----");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("\n----- Cat -----");
        cat.eat();
        cat.sleep();
        cat.meow();

        System.out.println("\n----- Cow -----");
        cow.eat();
        cow.sleep();
        cow.sound();
    }
}
