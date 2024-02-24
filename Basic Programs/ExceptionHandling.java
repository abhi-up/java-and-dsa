public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Attempt to perform division
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch division by zero exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Execute cleanup code regardless of whether an exception occurred or not
            System.out.println("Cleanup code executed");
        }
    }

    // Method to perform division
    public static int divide(int a, int b) {
        // Check if divisor is zero
        if (b == 0) {
            // Throw arithmetic exception if divisor is zero
            throw new ArithmeticException("Division by zero");
        }
        // Perform division
        return a / b;
    }
}
