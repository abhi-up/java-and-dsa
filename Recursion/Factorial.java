public class Factorial {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5; // Change this value to calculate factorial for a different number

        // Calculate factorial
        long result = factorial(num);

        // Output the result
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
