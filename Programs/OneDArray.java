
import java.util.Scanner;
import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + (double) sum / n);
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        System.out.println("\nReversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray length: " + arr.length);

        System.out.println("Element at index 0: " + arr[0]);

        sc.close();
    }
}
