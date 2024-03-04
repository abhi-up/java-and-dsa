public class LeetCodeSingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 4, 2 };
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberOptimized(nums));
    }

    // ---------------- Brute Force Appraoch(Naive Solution) ------------------
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                if (nums[i] == nums[j])
                    count++;
            }
            if (count == 0)
                return nums[i];
        }
        return -1;
    }

    // ---------------- Second Approach --------------------------
    public static int singleNumberOptimized(int[] nums) {
        int ans = 0; // Initialize the variable to store the result
        for (int i : nums) {
            ans = ans ^ i; // XOR operation to find the single number
        }

        return ans; // Return the single number that appears only once

    }

}
