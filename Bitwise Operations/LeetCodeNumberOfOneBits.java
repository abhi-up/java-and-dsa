// https://leetcode.com/problems/number-of-1-bits/description/
// 191. Number of 1 Bits
// Unsigned integer == non-negative whole number

public class LeetCodeNumberOfOneBits {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int mask = 1; // Initialize a mask with the least significant bit set (0000 ... 0001)
        int bits = 0; // Initialize a variable to count the number of set bits

        // Iterate 32 times to consider all 32 bits of the unsigned integer n
        for (int i = 1; i <= 32; i++) {
            // Check if the least significant bit of n is set (equal to 1)
            // If it is set, increment the bits count by 1
            bits += (n & mask) == 0 ? 0 : 1;

            // Shift the mask to the left by 1 position to move to the next bit position
            mask <<= 1;
        }

        // Return the total count of set bits in the binary representation of n
        return bits;
    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println("Number of set bits in " + num + ": " + hammingWeight(num)); // Output: 3
    }

}
