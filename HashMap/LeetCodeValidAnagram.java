import java.util.HashMap;
import java.util.Map;

public class LeetCodeValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Increment frequency for character ch1 in map
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);

            // Decrement frequency for character ch2 in map
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);
        }

        // If all frequencies are zero, strings are anagrams
        for (int freq : map.values()) {
            if (freq != 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
