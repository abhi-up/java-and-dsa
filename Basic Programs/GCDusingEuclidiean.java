public class GCDusingEuclidiean {
    public static void main(String[] args) {
        int a = 24, b = 36; // Example numbers

        int gcd = findGCD(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    // Function to find GCD of two numbers using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Using abs() to handle negative numbers
    }
}
