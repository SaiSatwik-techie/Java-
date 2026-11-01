//Problem: Calculate the factorial of a number using a do-while loop
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;
        int i = 1;

        do {
            fact = fact * i;
            i++;
        } while (i <= num);

        System.out.println("Factorial: " + fact);

        sc.close();
    }
}
