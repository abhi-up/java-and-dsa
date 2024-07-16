public class Fibonacci {
    public static void main(String[] args) {
        int n = 100; // Example value of n

        System.out.println("Fibonacci numbers up to " + n + ":");

        printFibonacci(n);
    }

    // Function to print Fibonacci numbers up to n iteratively
    public static void printFibonacci(int n) {
        int a = 0, b = 1, c = 0;

        // Print the first two Fibonacci numbers
        System.out.print(a + " ");
        if (n >= 1) {
            System.out.print(b + " ");
        }

        // Calculate and print subsequent Fibonacci numbers
        while ((c = a + b) <= n) {
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
