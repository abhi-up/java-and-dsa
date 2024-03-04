// https://leetcode.com/problems/sort-colors/submissions/1193614558/
// Sort Colors 

import java.util.Arrays;

public class LeetCodeSortColors {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 0, 0, 2, 1, 1 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int low = 0; // Initialize a pointer for the low end of the array
        int high = nums.length - 1; // Initialize a pointer for the high end of the array
        int i = 0; // Initialize a pointer for iterating through the array

        // Loop until the iteration pointer crosses the high pointer
        while (i <= high) {
            // If the current element is 1, move to the next element
            if (nums[i] == 1) {
                i++;
            }
            // If the current element is 0, swap it with the element at the low pointer,
            // then move both the low and iteration pointers to the next element
            else if (nums[i] == 0) {
                swap(nums, i, low);
                low++;
                i++;
            }
            // If the current element is 2, swap it with the element at the high pointer,
            // then move the high pointer to the previous element.
            // No need to move the iteration pointer in this case.
            else {
                swap(nums, i, high);
                high--;
            }
        }

    }

    private static void swap(int[] nums, int i, int key) {
        int temp = nums[i];
        nums[i] = nums[key];
        nums[key] = temp;
    }
}
