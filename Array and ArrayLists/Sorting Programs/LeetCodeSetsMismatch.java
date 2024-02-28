// Problem Link: https://leetcode.com/problems/set-mismatch/description/
// Problem Title: 645. Set Mismatch

import java.util.Arrays;

public class LeetCodeSetsMismatch {
    public static void main(String[] args) {
        // Test input
        int[] nums = { 2, 4, 2, 1 };

        // Printing the result of findErrorNums
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    // Function to find the error numbers in the given array
    public static int[] findErrorNums(int[] nums) {
        // Array to store the result, initialized with two zeros
        int[] ans = new int[2];
        // Pointer for iteration through the array
        int i = 0;

        // Iterating through the array to place each number at its correct index
        while (i < nums.length) {
            // Calculate the correct index for the current element
            int correct = nums[i] - 1;

            // If the current element is not at its correct index, swap it with the element
            // at its correct index
            if (nums[correct] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++; // Move to the next element if the current one is already at its correct index
            }
        }

        // Iterating through the array again to find the two error numbers
        for (int j = 0; j < nums.length; j++) {
            // If the element is not at its correct index, it is one of the error numbers
            if (nums[j] - 1 != j) {
                ans[0] = nums[j]; // Storing the repeated number as the first element of the result array
                ans[1] = j + 1; // Storing the missing number as the second element of the result array
            }
        }

        return ans; // Returning the array containing the error numbers
    }
}
