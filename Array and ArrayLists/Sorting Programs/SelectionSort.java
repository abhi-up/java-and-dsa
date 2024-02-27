import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        // Create an array of size 10
        int[] arr = new int[10];

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Fill the array with random numbers between 0 and 9999
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        // Print the original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Call the selectionSort method to sort the array
        selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    // Method to perform selection sort
    private static void selectionSort(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current index as the index of the minimum element
            int minIndex = i;
            // Iterate through the unsorted part of the array to find the index of the
            // minimum element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    // If a smaller element is found, update the minIndex
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element of the unsorted part
            if (minIndex != i)
                swap(arr, i, minIndex);
        }
    }

    // Method to swap two elements in an array
    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
