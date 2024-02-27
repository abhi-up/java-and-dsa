import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        // Define the array
        int[] arr = { 3, 5, 2, 1, 4 }; // It should be in range of 1 to N or 0 to N-1 basically continous values

        // Print the original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Call the cyclicSort method to sort the array
        cyclicSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    // Method to perform cyclic sort
    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Calculate the correct index where the current element should be placed
            int correct = arr[i] - 1;
            // Check if the current element is at its correct position
            if (arr[i] != arr[correct]) {
                // Swap the current element with the element at its correct position
                swap(arr, i, correct);
            } else {
                // Move to the next element
                i++;
            }
        }
    }

    // Method to swap two elements in an array
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
