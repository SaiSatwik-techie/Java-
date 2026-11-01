//Problem: Find the sum of digits of a number using a while loop
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
