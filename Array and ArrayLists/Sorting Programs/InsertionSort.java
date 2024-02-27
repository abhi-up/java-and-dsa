import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
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
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
    }
}
