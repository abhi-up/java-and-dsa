// https://leetcode.com/problems/contains-duplicate/
// 217. Contains Duplicate

import java.util.HashSet;
import java.util.Set;

public class LeetCodeContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        // Use a HashSet to keep track of the unique elements in the array.
        // If an element is already in the set, it is a duplicate
        Set<Integer> numSet = new HashSet<>();

        // Iterate through the input array
        for (int num : nums) {
            // If the set does not contain the current element, add it to the set
            if (!numSet.add(num)) {
                // If the set already contains the element, it is a duplicate
                return true;
            }
        }

        // If all elements are unique, the set will be the same size as the input array
        return false;
    }
}
