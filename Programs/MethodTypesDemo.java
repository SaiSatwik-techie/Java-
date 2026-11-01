class MethodTypesDemo {

    // 1. No parameters and no return value
    void welcome() {
        System.out.println("Welcome to Java!");
    }

    // 2. Parameters and no return value
    void printSquare(int num) {
        System.out.println("Square: " + (num * num));
    }

    // 3. No parameters but returns a value
    int getNumber() {
        return 100;
    }

    // 4. Parameters and returns a value
    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {

        MethodTypesDemo obj = new MethodTypesDemo();

        // Type 1
        obj.welcome();

        // Type 2
        obj.printSquare(5);

        // Type 3
        int number = obj.getNumber();
        System.out.println("Returned Number: " + number);

        // Type 4
        int area = obj.calculateArea(10, 5);
        System.out.println("Rectangle Area: " + area);
    }
}