import java.util.Arrays;

public class LeetCodeCountingBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }

    public static int[] countBits(int n) {

        int[] result = new int[n + 1]; // Array to store the count of set bits for each number

        // Iterate through each number from 0 to n
        for (int i = 0; i <= n; i++) {
            int mask = 1; // Initialize a mask with the least significant bit set (0000 ... 0001)
            int bits = 0; // Initialize a variable to count the number of set bits

            // Iterate 32 times to consider all 32 bits of the integer i
            for (int j = 1; j <= 32; j++) {
                // Check if the least significant bit of i is set (equal to 1)
                // If it is set, increment the bits count by 1
                bits += (i & mask) == 0 ? 0 : 1;

                // Shift the mask to the left by 1 position to move to the next bit position
                mask <<= 1;
            }

            // Store the total count of set bits in the result array for the current number
            // i
            result[i] = bits;
        }

        return result; // Return the result array containing the count of set bits for each number

    }
}
