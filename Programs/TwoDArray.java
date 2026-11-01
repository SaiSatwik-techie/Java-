
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");

        int totalSum = 0;
        int max = arr[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(arr[i][j] + " ");

                totalSum += arr[i][j];

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nSum of all elements: " + totalSum);
        System.out.println("Largest element: " + max);

        System.out.println("\nSum of each row:");

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;

            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j];
            }

            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("\nSum of each column:");

        for (int j = 0; j < cols; j++) {
            int colSum = 0;

            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }

            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        System.out.println("\nTranspose of matrix:");

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
