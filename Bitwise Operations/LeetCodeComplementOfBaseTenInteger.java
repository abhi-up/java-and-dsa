public class LeetCodeComplementOfBaseTenInteger {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(bitwiseComplement(n));
    }

    public static int bitwiseComplement(int n) {
        // If n is 0, its complement is 1
        if (n == 0)
            return 1;

        // Initialize a mask to all 0s
        int mask = 0;

        // Calculate the bitwise complement of n
        int negatedN = ~n;

        // Determine the number of bits in n by shifting right until n becomes 0
        while (n != 0) {
            n = n >> 1; // Right shift n by 1 position
            mask = mask << 1 | 1; // Left shift the mask by 1 position and set the least significant bit to 1
        }

        // Apply the mask to the bitwise complement of n to get the final result
        return negatedN & mask;
    }
}