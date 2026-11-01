
interface Flyer {

    void fly();
}

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
        System.out.println("Mammal walks.");
    }
}

class Bird extends Animal {

    void layEggs() {
        System.out.println("Bird lays eggs.");
    }
}

class Bat extends Mammal implements Flyer {

    public void fly() {
        System.out.println("Bat flies at night.");
    }

    void display() {
        eat();
        sleep();
        walk();
        fly();
    }
}

public class HybridInheritanceDemo {

    public static void main(String[] args) {

        Bat bat = new Bat();

        System.out.println("----- Bat Information -----");

        bat.display();

        Bird bird = new Bird();

        System.out.println("\n----- Bird Information -----");

        bird.eat();
        bird.sleep();
        bird.layEggs();
    }
}
