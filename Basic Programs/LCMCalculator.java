public class LCMCalculator {
    public static void main(String[] args) {
        int a = 12, b = 18, c = 24; // Example numbers

        // Calculate LCM of two numbers
        int lcmAB = lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmAB);

        // Calculate LCM of three numbers
        int lcmABC = lcm(lcmAB, c);
        System.out.println("LCM of " + a + ", " + b + " and " + c + " is: " + lcmABC);
    }

    // Function to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return Math.abs(a * (b / gcd(a, b)));
    }

    // Function to calculate GCD of two numbers using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
