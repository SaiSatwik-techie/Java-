
interface Swimmer {

    void swim();
}

interface Flyer {

    void fly();
}

class Duck implements Swimmer, Flyer {

    public void swim() {
        System.out.println("Duck is swimming in the water.");
    }

    public void fly() {
        System.out.println("Duck is flying in the sky.");
    }

    void sound() {
        System.out.println("Duck says: Quack! Quack!");
    }
}

public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        Duck duck = new Duck();

        duck.swim();
        duck.fly();
        duck.sound();
    }
}
