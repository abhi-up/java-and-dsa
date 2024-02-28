// Approach to find the first missing positive integer in an array
// Time complexity: O(n), where n is the length of the array
// Space complexity: O(1), since the algorithm operates in place

// Main method to demonstrate the functionality
public class LeetCodeFirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        System.out.println(firstMissingPositive(nums));
    }

    // Method to find the first missing positive integer
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        // Rearrange the array such that each positive integer is at its correct index
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (correct >= 0 && correct >= nums.length && nums[correct] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Iterate through the sorted array to find the first missing positive integer
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                return j + 1;
        }
        // If no missing positive integer found, return the next positive integer
        return nums.length + 1;
    }
}