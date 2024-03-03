import java.util.Arrays;

public class LeetCodeCountPrimes {
    public static void main(String[] args) {
        System.out.println("No. of Primes are: " + countPrimes(10));
    }
    // ----------------- Time Limit Exceed Code --------------------
    // public static int countPrimes(int n) {
    // int count = 0;
    // for (int i = 2; i < n; i++) {
    // if (isPrime(i)) {
    // count++;
    // }
    // }
    // return count;
    // }

    // ------------------ Sieve of Eratosthenes ---------------------
    public static int countPrimes(int n) {
        // Array to store whether each number up to n is prime
        boolean[] primes = new boolean[n + 1];

        // Initialize all elements of the primes array to true initially
        Arrays.fill(primes, true);

        // Initialize a counter to count the number of prime numbers found
        int count = 0;

        // Iterate through each number from 2 to n-1
        for (int i = 2; i < n; i++) {
            // If the current number is marked as prime
            if (primes[i]) {
                // Increment the count of prime numbers
                count++;

                // Mark all multiples of the current prime number as non-prime
                for (int j = 2 * i; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        // Return the count of prime numbers found
        return count;
    }

    // private static boolean isPrime(int num) {
    // if (num <= 1) {
    // return false;
    // }
    // int b = 2; // Counter for checking factors of 'num'
    // while (b <= Math.sqrt(num)) {
    // if (num % b == 0) {
    // return false; // If 'num' is divisible by any number other than 1 and itself,
    // it's not prime
    // }
    // b++; // Move to the next number to check
    // }
    // return true;
    // }

}