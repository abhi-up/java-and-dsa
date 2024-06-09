import java.util.HashMap;

public class LeetCodeSubarraySumDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            prefixSum += num;
            int mod = prefixSum % k;
            if (mod < 0) {
                mod += k;
            }
            if (map.containsKey(mod)) {
                count += map.get(mod);
                map.put(mod, map.get(mod) + 1);
            } else {
                map.put(mod, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LeetCodeSubarraySumDivisibleByK solution = new LeetCodeSubarraySumDivisibleByK();

        int[] nums1 = { 4, 5, 0, -2, -3, 1 };
        int k1 = 5;
        System.out.println("Number of subarrays divisible by " + k1 + ": " + solution.subarraysDivByK(nums1, k1));

        int[] nums2 = { 1, 2, 3, 4, 5 };
        int k2 = 3;
        System.out.println("Number of subarrays divisible by " + k2 + ": " + solution.subarraysDivByK(nums2, k2));
    }
}
