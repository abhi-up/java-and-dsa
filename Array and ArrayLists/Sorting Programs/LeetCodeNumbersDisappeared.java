// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1188069332/
// 448. Find All Numbers Disappeared in an Array (leetCode)

import java.util.Arrays;

public class LeetCodeNumbersDisappeared {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] missing = findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(missing));
    }

    // Method to find disappeared numbers
    public static int[] findDisappearedNumbers(int[] nums) {
        int i = 0; // Initialize a variable to track the current index
        int[] result = new int[2]; // Initialize an array to store the missing numbers
        while (i < nums.length) {
            int correct = nums[i] - 1; // Calculate the correct index for the current number
            if (nums[i] != nums[correct]) {
                // If the current number is not at its correct position, swap it
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++; // Move to the next index
            }
        }
        int count = 0; // Initialize a variable to track the count of missing numbers
        // Iterate through the array to find missing numbers
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) {
                result[count++] = j + 1; // Store the missing number in the result array
            }
        }
        return result; // Return the array containing missing numbers
    }
}
