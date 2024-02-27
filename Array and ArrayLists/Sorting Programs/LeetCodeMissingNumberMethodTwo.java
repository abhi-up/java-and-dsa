/* 
268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums. */

public class LeetCodeMissingNumberMethodTwo {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int difference; // Variable to store the difference between the actual sum and the sum of
                        // elements in the array
        int actualSum = 0; // Variable to store the sum of consecutive numbers from 0 to n (where n is the
                           // length of the array)
        int sum = 0; // Variable to store the sum of elements in the array

        // Calculate the sum of elements in the array
        for (int i : arr) {
            sum += i;
        }

        // Calculate the sum of consecutive numbers from 0 to n (where n is the length
        // of the array)
        for (int i = 0; i <= arr.length; i++) {
            actualSum += i;
        }

        // Calculate the difference between the actual sum and the sum of elements in
        // the array
        difference = actualSum - sum;

        // Print the difference
        System.out.println(difference);
    }

}
