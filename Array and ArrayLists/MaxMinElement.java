public class MaxMinElement {
    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = { 5, 3, 9, 1, 7, 2, 8 };

        // Call the method to find maximum and minimum values
        findMaxMin(numbers);
    }

    // Method to find maximum and minimum values
    public static void findMaxMin(int[] arr) {
        // Initialize variables to store maximum and minimum values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Iterate through the array to find maximum and minimum values
        for (int num : arr) {
            // Update maximum value if current number is greater
            if (num > max) {
                max = num;
            }
            // Update minimum value if current number is smaller
            if (num < min) {
                min = num;
            }
        }

        // Print the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
