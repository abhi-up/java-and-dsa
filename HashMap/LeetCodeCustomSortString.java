// https://leetcode.com/problems/custom-sort-string/?envType=daily-question&envId=2024-03-11
// 791. Custom Sort String

import java.util.HashMap;
import java.util.Map;

public class LeetCodeCustomSortString {
    public static void main(String[] args) {
        String order = "bcaf";
        String str = "abcccd";

        System.out.println(customSortString(order, str));
    }

    public static String customSortString(String order, String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (char c : order.toCharArray()) {
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);

                while (count > 0) {
                    result.append(c);
                    count--;
                }

                charCount.remove(c);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                result.append(c);
                count--;
            }
        }

        return result.toString();

    }
}