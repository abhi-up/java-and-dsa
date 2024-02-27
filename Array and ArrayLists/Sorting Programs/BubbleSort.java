import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        // Create an array of size 10
        int[] arr = new int[11];

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Fill the array with random numbers between 0 and 9999
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        // Print the original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Call the selectionSort method to sort the array
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        // run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            // for each step, max item will come at the last respective index
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // swap if the item is smaller than the prev item
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Swap method to swap 2 elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
