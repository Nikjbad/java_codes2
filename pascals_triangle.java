
import java.util.Scanner;

public class pascals_triangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate the next number in the row
            }
            System.out.println();
        }

        scanner.close();
    }
}