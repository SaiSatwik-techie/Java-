
abstract class Shape {

    abstract void calculateArea();

}

class Circle extends Shape {

    @Override
    void calculateArea() {
        int radius = 5;
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Square extends Shape {

    @Override
    void calculateArea() {
        int side = 4;
        System.out.println("Square Area: " + (side * side));
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.calculateArea();

        Square s = new Square();
        s.calculateArea();
    }
}
