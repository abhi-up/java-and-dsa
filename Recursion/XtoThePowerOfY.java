public class XtoThePowerOfY {
    public static void main(String[] args) {
        // Define base and power
        int base = 5;
        int power = 3;

        // Calculate and print the result
        System.out.println(powerOf(base, power));
    }

    // Recursive function to calculate power
    private static int powerOf(int base, int power) {
        // Base case: if power is 0, return 1
        if (power == 0)
            return 1;
        // Recursive case: multiply base by powerOf(base, power - 1)
        return base * powerOf(base, power - 1);
    }
}
