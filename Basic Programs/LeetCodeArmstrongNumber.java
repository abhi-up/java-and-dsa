/*
1134. Armstrong Number
Description:
Given an integer n, return true if and only if it is an Armstrong number.
The k-digit number n is an Armstrong number if and only if the kth power of each digit sums to n.

Example 1:

Input: n = 153
Output: true
Explanation: 153 is a 3-digit number, and 153 = 13 + 53 + 33.

Example 2:

Input: n = 123
Output: false
Explanation: 123 is a 3-digit number, and 123 != 13 + 23 + 33 = 36.
 */

public class LeetCodeArmstrongNumber {

    public static boolean isArmstrong(int n) {
        // Converting n into String and then counting the number of digits in n
        int numDigits = (n + "").length();

        int originalNumber = n;
        int sum = 0;

        // Calculate the sum of the kth power of each digit
        while (n > 0) {
            int digit = n % 10; // Extract the last digit of n
            sum += Math.pow(digit, numDigits); // Add the kth power of the digit to the sum
            n /= 10; // Move to the next digit
        }

        // Return true if the sum equals the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        // Test cases
        int n1 = 153;
        System.out.println(n1 + " is an Armstrong number: " + isArmstrong(n1)); // Output: true

        int n2 = 123;
        System.out.println(n2 + " is an Armstrong number: " + isArmstrong(n2)); // Output: false
    }
}
