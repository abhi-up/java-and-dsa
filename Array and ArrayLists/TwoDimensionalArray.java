
// Import the Scanner class for user input
import java.util.Scanner;

public class TwoDimensionalArray {

    // Main method to run the program
    public static void main(String[] args) {

        // Declare a 2D array of integers with 3 rows and 3 columns
        int[][] arr = new int[3][3];

        // Declare a pre-defined 2D array with different dimensions
        int[][] newArr = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter elements for the first array
        System.out.println("Enter the elements of the 2-D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Read input from the user and store it in the array
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the user-entered 2D array
        System.out.println("Printing the 2-D array(User Input Array):");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Print each element with a space
                System.out.print(arr[i][j] + " ");
            }
            // Add a newline after each row
            System.out.println("");
        }

        // Print the pre-defined 2D array
        System.out.println("Printing the 2-D array(Pre-defined Array):");
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                // Print each element with a space
                System.out.print(newArr[i][j] + " ");
            }
            // Add a newline after each row
            System.out.println("");
        }

        // Close the Scanner object to avoid resource leaks
        sc.close();
    }
}
