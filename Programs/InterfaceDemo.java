
interface Remote {
    void turnOn();
    void turnOff();
}

class Television implements Remote {

    public void turnOn() {
        System.out.println("Television is ON");
    }

    public void turnOff() {
        System.out.println("Television is OFF");
    }
}

class AC implements Remote {

    public void turnOn() {
        System.out.println("AC is ON");
    }

    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();

        System.out.println();

        AC ac = new AC();
        ac.turnOn();
        ac.turnOff();
    }
}
