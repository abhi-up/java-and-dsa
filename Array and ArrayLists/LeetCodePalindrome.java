/* 9. Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */

public class LeetCodePalindrome {
    public static boolean isPalindrome(int x) {
        // If x is 0, it's a palindrome since it reads the same forwards and backwards
        if (x == 0)
            return true;

        // If x is negative or the last digit is 0 (except if x is 0), it's not a
        // palindrome
        if (x < 0 || x % 10 == 0)
            return false;

        // Initialize a variable to store the reversed number
        int revX = 0;

        // Reverse the number until half of it
        while (x > revX) {
            // Append the last digit of x to the reversed number
            revX = revX * 10 + x % 10;
            // Remove the last digit from x
            x /= 10;
        }

        // If the original number x is equal to the reversed number revX or revX without
        // its last digit (for odd-length palindromes), it's a palindrome
        if (x == revX || x == revX / 10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // Test cases
        int x = 121;
        // Check if x is a palindrome number
        boolean result = isPalindrome(x);
        // Output the result
        if (result)
            System.out.println(x + " is a Palindrome Number");
        else
            System.out.println(x + " is not a Palindrome Number");

        // Test case with a negative number
        x = -121;
        // Check if x is a palindrome number
        result = isPalindrome(x);
        // Output the result
        if (result)
            System.out.println(x + " is a Palindrome Number");
        else
            System.out.println(x + " is not a Palindrome Number");

        // Test case with a non-palindrome number
        x = 10;
        // Check if x is a palindrome number
        result = isPalindrome(x);
        // Output the result
        if (result)
            System.out.println(x + " is a Palindrome Number");
        else
            System.out.println(x + " is not a Palindrome Number");
    }

}