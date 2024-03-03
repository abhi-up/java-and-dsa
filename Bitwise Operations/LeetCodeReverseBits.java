// https://leetcode.com/problems/reverse-bits/
// Problem No: 190 Reverse Bits

public class LeetCodeReverseBits {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        int reversedNum = 0; // Initialize variable to store the reversed number

        // Iterate 32 times to reverse all 32 bits of the input number n
        for (int i = 0; i < 32; i++) {
            reversedNum <<= 1; // Left shift the reversed number to make space for the next bit

            int lastBit = n & 1; // Extract the least significant bit of the input number n
            reversedNum = reversedNum | lastBit; // Set the extracted bit in the reversed number

            n = n >> 1; // Right shift the input number n to move to the next bit position
        }

        return reversedNum; // Return the reversed number
    }

}