public class LeetCodeSumOfTwoIntegers {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println("Sum of 2 numbers is: " + getSum(a, b));
    }

    public static int getSum(int a, int b) {
        // Repeat the addition process until there's no carry left
        while (b != 0) {
            int carry = a & b; // Calculate the carry by bitwise AND of a and b
            a = a ^ b; // Perform addition without considering the carry using XOR
            b = carry << 1; // Left shift the carry to prepare for the next addition
        }
        return a; // Return the final sum
    }

}
