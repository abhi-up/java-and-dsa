import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 15, 25, 35, 45, 55, 65, 75, 85 }; // Define an array

        reverseArray(arr); // Call the method to reverse the array
        System.out.println(Arrays.toString(arr)); // Print the reversed array
    }

    // Method to reverse the elements of an array
    private static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) { // Swap elements until the middle of the array is reached
            swap(arr, i, j); // Call the swap method to swap elements at positions i and j
            i++;
            j--;
        }
    }

    // Method to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; // Store the value of arr[i] in a temporary variable
        arr[i] = arr[j]; // Assign the value of arr[j] to arr[i]
        arr[j] = temp; // Assign the value stored in the temporary variable to arr[j]
    }
}
