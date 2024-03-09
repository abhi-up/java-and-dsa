import java.util.HashMap;

public class LeetCodeMinCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {
        // Create a HashMap to store the count of numbers from nums1
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count the occurrences of each number in nums1
        for (int num : nums1) {
            // Increment the count of the current number in the HashMap
            // If the number is not present, set its count to 1
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Iterate through nums2 to find the first common number
        for (int num : nums2) {
            // If the current number exists in the HashMap, return it
            if (mp.containsKey(num)) {
                return num;
            }
        }

        // If no common number is found, return -1
        return -1;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4 };

        System.out.println(getCommon(nums1, nums2));
    }
}
