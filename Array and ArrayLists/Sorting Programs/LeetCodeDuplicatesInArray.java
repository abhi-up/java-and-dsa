// https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/1188448344/
// 442. Find All Duplicates in an Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(Arrays.toString(findDuplicates(nums).toArray()));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>(); // List to store duplicate elements
        int i = 0; // Pointer for iteration through the array

        // Iterate through the array to place each number at its correct index
        while (i < nums.length) {
            int correct = nums[i] - 1; // Calculate the correct index for the current element

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

        // Iterate through the array again to find elements that are not at their
        // correct index
        for (int j = 0; j < nums.length; j++) {
            // If the element is not at its correct index, it is a duplicate
            if (nums[j] - 1 != j) {
                ans.add(nums[j]); // Add the duplicate element to the list
            }
        }

        return ans; // Return the list of duplicate elements
    }
}
