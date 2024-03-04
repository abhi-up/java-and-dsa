// https://leetcode.com/problems/two-sum/description/
// Two Sums

import java.util.Arrays;

public class LeetCodeTwoSums {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = new int[2];
        result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int targetNum = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == targetNum) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}