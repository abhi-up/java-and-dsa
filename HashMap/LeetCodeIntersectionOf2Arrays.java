// https://leetcode.com/problems/intersection-of-two-arrays/?envType=daily-question&envId=2024-03-10
// 349. Intersection of Two Arrays

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeIntersectionOf2Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> ans = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num) && !ans.containsKey(num)) {
                ans.put(num, null);
            }
        }

        int count = 0;
        int size = ans.size();
        int[] arr = new int[size];

        for (Integer key : ans.keySet()) {
            arr[count] = key;
            count++;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] num1 = { 4, 9, 5 };
        int[] num2 = { 9, 4, 9, 8, 4 };

        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

}
