// https://leetcode.com/problems/maximum-subarray/solutions/3666304/beats-100-c-java-python-beginner-friendly/
// 53. Maximum Subarray

public class LeetCodeMaxSubarray {

    // Method to find the maximum sum of contiguous subarray
    public static int maxSubArray(int[] nums) {
        // Initializing variables to keep track of maximum sum and current sum
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value
        int currSum = 0; // Initialize currSum to 0

        // Iterate through the array
        for (int n : nums) {
            currSum += n; // Add the current element to currSum

            // Update maxSum if currSum is greater
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            // If currSum becomes negative, reset it to 0
            if (currSum < 0) {
                currSum = 0;
            }
        }
        // Return the maximum sum
        return maxSum;
    }

    // Main method to test the maxSubArray function
    public static void main(String[] args) {
        // Test input array
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Print the maximum sum of contiguous subarray
        System.out.println(maxSubArray(nums));
    }
}
