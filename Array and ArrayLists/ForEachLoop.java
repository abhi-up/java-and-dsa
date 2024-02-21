/* For Loop: Use when you need to control the iteration explicitly, especially when you require access to the index of each element or need to perform a specific number of iterations.
------------------------------------------------------------------------------------------
For-Each Loop: Use when you want a simpler syntax and don't need explicit control over the iteration, especially when traversing the entire collection without modifying its elements or when you don't need access to the index. */

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        // Initialize Array 1 with predefined values
        int[] arr1 = { 12, 34, 54, 12, 45 };

        // Initialize Array 2 with user input
        int[] arr2 = new int[5];

        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter elements for Array 2
        System.out.println("Enter the elements of Array 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt(); // Read user input and assign it to Array 2
        }

        // Print the elements of Array 1
        System.out.print("The elements of Array 1 are: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Move to the next line

        // Print the elements of Array 2 using a for-each loop
        System.out.print("The elements of Array 2 are: ");
        for (int num : arr2) {
            System.out.print(num + " "); // Print each element followed by a space
        }
    }
}
