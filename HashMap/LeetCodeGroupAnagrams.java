// https://leetcode.com/problems/group-anagrams/submissions/1197418671/
// Group Anagrams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeGroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store anagrams where the key is the sorted version of the
        // word
        // and the value is a list of anagrams with the same sorted version
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each word in the input array
        for (String word : strs) {
            // Convert the word to a character array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars); // Convert sorted char array back to string

            // Check if the sorted word is already present as a key in the map
            if (!map.containsKey(sortedWord)) {
                // If not present, create a new ArrayList to store anagrams with this sorted
                // word
                map.put(sortedWord, new ArrayList<>());
            }

            // Add the original word to the list of anagrams corresponding to the sorted
            // word
            map.get(sortedWord).add(word);
        }

        // Return a list of lists containing all groups of anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(groupAnagrams(strs));
    }
}
