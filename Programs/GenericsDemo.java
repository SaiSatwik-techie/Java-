
import java.util.*;

class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericsDemo {

    // Generic method
    static <T> void display(T data) {
        System.out.println(data);
    }

    // Bounded type
    static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {

        // Generic class
        Box<Integer> b1 = new Box<>();
        b1.set(100);
        System.out.println("Integer: " + b1.get());

        Box<String> b2 = new Box<>();
        b2.set("Hello Java");
        System.out.println("String: " + b2.get());

        // Generic method
        display(10);
        display("Welcome");

        // Bounded type parameter
        System.out.println("Sum: " + add(10, 20));

        // Wildcard
        List<Integer> list = Arrays.asList(10, 20, 30);
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        System.out.println("List Sum: " + sum);
    }
}
