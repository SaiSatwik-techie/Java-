public class CommandLineDemo {

    public static void main(String[] args) {

        // Display the total number of arguments
        System.out.println("Total Arguments: " + args.length);

        // Display all arguments
        System.out.println("\nCommand Line Arguments:");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }

        // Access individual arguments
        if (args.length >= 2) {

            System.out.println("\nFirst Argument: " + args[0]);
            System.out.println("Second Argument: " + args[1]);

        } else {
            System.out.println("\nPlease provide at least two arguments.");
        }

        // Adding two numbers passed as arguments
        if (args.length >= 2) {

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("\nAddition: " + (a + b));
        }
    }
}