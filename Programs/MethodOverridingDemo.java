
class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    void eat() {
        System.out.println("Animal eats food.");
    }

    void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    @Override
    void display() {
        System.out.println("This is a Dog.");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }

    @Override
    void display() {
        System.out.println("This is a Cat.");
    }
}

class Cow extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cow says: Moo! Moo!");
    }

    @Override
    void display() {
        System.out.println("This is a Cow.");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("----- Individual Objects -----");

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

        System.out.println("\n----- Inherited Method -----");

        dog.eat();
        cat.eat();
        cow.eat();

        System.out.println("\n----- Overridden Display Methods -----");

        dog.display();
        cat.display();
        cow.display();

        System.out.println("\n----- Runtime Polymorphism -----");

        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Cow();
        animal.makeSound();
    }
}
