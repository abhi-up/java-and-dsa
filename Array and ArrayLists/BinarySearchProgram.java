import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = generateRandomArray(size); // Generating a random array
        printArray(array); // Printing the generated array

        Arrays.sort(array); // Sorting the array for binary search
        System.out.println("\nArray after sorting:");
        printArray(array); // Printing the sorted array

        System.out.print("\nEnter a number to search in the array: ");
        int key = sc.nextInt();

        int result = binarySearch(key, array); // Performing binary search
        if (result == -1)
            System.out.println("\nElement not found in the array!");
        else
            System.out.println("\n Element found at index: " + result);

        sc.close();
    }

    // Method to generate a random array of given size
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generates random integers between 0 and 99
        }
        return array;
    }

    // Method to print the array
    private static void printArray(int[] array) {
        System.out.println("Generated Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Binary search method
    private static int binarySearch(int key, int[] array) {
        int high = array.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculating mid to avoid potential overflow
            if (key < array[mid])
                high = mid - 1;
            else if (key > array[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1; // Key not found
    }
}
