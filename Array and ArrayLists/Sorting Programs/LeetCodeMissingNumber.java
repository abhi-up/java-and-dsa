// https://leetcode.com/problems/missing-number/
// Amazon Question

public class LeetCodeMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        System.out.println(missingNumber(arr));

    }

    private static int missingNumber(int[] arr) {
        int i = 0; // Initialize a variable to track the current index
        int num = 0; // Initialize a variable to store the missing number

        // Iterate through the array
        while (i < arr.length) {
            int current = arr[i]; // Get the current element

            // If the current element is not equal to the length of the array
            // and the element at the index equal to the current element is not equal to the
            // current element
            if (current != arr.length && arr[current] != arr[i]) {
                // Swap the current element with the element at the index equal to the current
                // element
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++; // Move to the next index
            }
        }

        // Iterate through the array again
        for (int j = 0; j < arr.length; j++) {
            // If the element at index j is not equal to j
            if (arr[j] != j)
                num = j; // Set num to j
        }
        return num; // Return the missing number
    }
}
