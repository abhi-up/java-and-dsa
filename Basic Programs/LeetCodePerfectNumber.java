public class LeetCodePerfectNumber {
    public static void main(String[] args) {
        int n = 28; // Example number

        if (isPerfectNumber(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }

    // Function to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 1; // Start with 1 as 1 is always a divisor

        // Calculate sum of proper divisors
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        // Check if the sum of proper divisors equals the number itself
        return sum == number;
    }
}
