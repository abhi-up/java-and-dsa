/* 
7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21 
*/

public class LeetCodeReverseInteger {

    public int reverse(int x) {
        // Define the maximum and minimum values for a 32-bit signed integer
        int MAX_INT = Integer.MAX_VALUE;
        int MIN_INT = Integer.MIN_VALUE;

        // Initialize a variable to store the reversed integer
        int reversedX = 0;

        // Reverse the digits of the integer
        while (x != 0) { // Continue looping until all digits have been processed
            // Check for overflow/underflow conditions before updating the reversed integer
            if (reversedX > MAX_INT / 10 || reversedX < MIN_INT / 10)
                return 0; // Return 0 if overflow/underflow occurs

            // Update the reversed integer by appending the last digit of x
            reversedX = (reversedX * 10) + (x % 10); // Extract the last digit and append it to the reversed number
            x /= 10; // Move to the next digit
        }

        // Return the reversed integer
        return reversedX;
    }

    public static void main(String[] args) {
        LeetCodeReverseInteger solution = new LeetCodeReverseInteger();
        int x = 123;
        System.out.println(solution.reverse(x)); // Output: 321

        x = -123;
        System.out.println(solution.reverse(x)); // Output: -321

        x = 120;
        System.out.println(solution.reverse(x)); // Output: 21
    }
}
