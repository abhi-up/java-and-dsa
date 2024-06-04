import java.util.HashSet;

public class LeetCodeLongestPalindrome {
    // This method returns the length of the longest palindrome that can be formed
    // from the input string.
    public int longestPalindrome(String s) {
        // Initialize a counter to store the length of the longest palindrome.
        int count = 0;

        // Create a HashSet to store unique characters in the string.
        HashSet<Character> data = new HashSet<Character>();

        // Iterate through each character in the input string.
        for (int i = 0; i < s.length(); i++) {
            // Get the current character.
            char c = s.charAt(i);

            // If the HashSet already contains the character, it means we've found a pair.
            if (data.contains(c)) {
                // Increment the count by 2, as we've found a pair of characters.
                count += 2;
                // Remove the character from the HashSet to avoid counting it again.
                data.remove(c);
            } else {
                // If the character is not in the HashSet, add it.
                data.add(c);
            }
        }

        // If there are any characters left in the HashSet, it means they don't have a
        // pair.
        // In this case, we can include one of them in the palindrome, so increment the
        // count by 1.
        if (data.size() > 0) {
            count++;
        }

        // Return the length of the longest palindrome.
        return count;
    }

    // Main method to test the longestPalindrome method
    public static void main(String[] args) {
        LeetCodeLongestPalindrome solution = new LeetCodeLongestPalindrome();

        // Test cases
        String test1 = "abccccdd";
        System.out.println("Longest palindrome length of '" + test1 + "': " + solution.longestPalindrome(test1)); // Expected
                                                                                                                  // output:
                                                                                                                  // 7

        String test2 = "a";
        System.out.println("Longest palindrome length of '" + test2 + "': " + solution.longestPalindrome(test2)); // Expected
                                                                                                                  // output:
                                                                                                                  // 1

        String test3 = "bb";
        System.out.println("Longest palindrome length of '" + test3 + "': " + solution.longestPalindrome(test3)); // Expected
                                                                                                                  // output:
                                                                                                                  // 2

        String test4 = "abc";
        System.out.println("Longest palindrome length of '" + test4 + "': " + solution.longestPalindrome(test4)); // Expected
                                                                                                                  // output:
                                                                                                                  // 1
    }
}
