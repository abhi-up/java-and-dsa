import java.util.Scanner; // Import Scanner class from java.util package

public class BitwiseEvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read user input as an integer

        // Check if the number is even or odd using bitwise AND operator
        if ((num & 1) == 0) {
            System.out.println("\nEven Number"); // If the result is 0, the number is even
        } else {
            System.out.println("Odd Number"); // If the result is 1, the number is odd
        }

        sc.close(); // Close the Scanner object to release system resources
    }
}
