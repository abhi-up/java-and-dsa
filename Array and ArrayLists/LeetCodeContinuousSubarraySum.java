import java.util.HashMap;

public class LeetCodeContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // To handle the case where the subarray starts from index 0
        int cumulativeSum = 0;

        for (int i = 0; i < nums.length; i++) {
            cumulativeSum += nums[i];
            int remainder = (k == 0) ? cumulativeSum : cumulativeSum % k;

            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LeetCodeContinuousSubarraySum solution = new LeetCodeContinuousSubarraySum();

        // Test cases
        int[] nums1 = { 23, 2, 4, 6, 7 };
        int k1 = 6;
        System.out.println(solution.checkSubarraySum(nums1, k1)); // Output: true

        int[] nums2 = { 23, 2, 6, 4, 7 };
        int k2 = 6;
        System.out.println(solution.checkSubarraySum(nums2, k2)); // Output: true

        int[] nums3 = { 23, 2, 6, 4, 7 };
        int k3 = 0;
        System.out.println(solution.checkSubarraySum(nums3, k3)); // Output: false

        int[] nums4 = { 0, 0 };
        int k4 = 0;
        System.out.println(solution.checkSubarraySum(nums4, k4)); // Output: true

        int[] nums5 = { 1, 2, 3 };
        int k5 = 5;
        System.out.println(solution.checkSubarraySum(nums5, k5)); // Output: false
    }
}
