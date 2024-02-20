public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 3; // Number to check if it's prime
        boolean isPrime = true; // Flag to track if the number is prime

        // Checking if the num is less than or equal to 1
        if (num <= 1) {
            System.out.println("Neither Prime nor Composite Number");
            // Exiting the program immediately
            System.exit(0);
        }

        // ----------- First Way -------------
        int count = 0; // Counter to count the number of factors of 'num'
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++; // Increment count if 'i' is a factor of 'num'
            }
        }
        if (count == 2) {
            System.out.println("Prime number"); // If 'num' has exactly 2 factors, it's prime
        } else {
            System.out.println("Not a Prime number"); // Otherwise, it's not prime
        }

        // ------------- Second Way --------------
        int c = 2; // Counter for checking factors of 'num'
        while (c < num) {
            if (num % c == 0) {
                isPrime = false; // If 'num' is divisible by any number other than 1 and itself, it's not prime
                break;
            }
            c++; // Move to the next number to check
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        // ---------------- Third Way ----------------
        // This is the most optimized approach
        int b = 2; // Counter for checking factors of 'num'
        while (b <= Math.sqrt(num)) {
            if (num % b == 0) {
                isPrime = false; // If 'num' is divisible by any number other than 1 and itself, it's not prime
                break;
            }
            b++; // Move to the next number to check
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
