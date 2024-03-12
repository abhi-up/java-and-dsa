// https://leetcode.com/problems/product-of-array-except-self/
// 238. Product of Array Except Self

import java.util.Arrays;

public class LeetCodeProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = { 0, 4, 0 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        // Length of the input array
        int n = nums.length;
        // Variable to store the product of all non-zero elements
        int product = 1;
        // Counter for the number of zeros in the array
        int zeroCount = 0;

        // Calculate the product of all non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // Increment zero count and skip to the next iteration if the current element is
                // zero
                zeroCount++;
                continue;
            }
            product *= nums[i];
        }

        // If there are multiple zeros, the product of all elements should be 0
        if (zeroCount > 1)
            product = 0;

        // Calculate the result array
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // If the current element is zero, set it to the product of all non-zero
                // elements
                nums[i] = product;
            } else if (zeroCount == 0) {
                // If there are no zeros, divide the product by the current element
                nums[i] = product / nums[i];
            } else {
                // If there are multiple zeros, set the current element to 0
                nums[i] = 0;
            }
        }

        // Return the result array
        return nums;

    }
}