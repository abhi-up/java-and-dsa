// https://leetcode.com/problems/power-of-two/description/
// 231. power of 2

public class LeetCodePowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(536870912));
    }

    public static boolean isPowerOfTwo(int n) {
        // If n is less than or equal to 0, it cannot be a power of 2
        if (n <= 0)
            return false;

        // Continue looping until n becomes 0
        while (n != 0) {
            // Extract the last bit of n using bitwise AND operation with 1
            int lastBit = n & 1;

            // Right shift n by 1 position to remove the last bit
            n = n >> 1;

            // If the last bit is 1 and n is not yet 0, then n is not a power of 2
            if (lastBit == 1 && n != 0)
                return false;
        }

        // If n becomes 0 after all the right shifts, it is a power of 2
        return true;

    }

}