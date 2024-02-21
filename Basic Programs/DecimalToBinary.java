public class DecimalToBinary {
    public static void main(String[] args) {
        // Decimal number to convert
        int decimalNumber = 13;

        // Initialize a variable to store the binary representation
        int binaryNumber = 0;

        // Initialize a variable to represent the position of the current binary digit
        int position = 1;

        // Convert decimal to binary
        while (decimalNumber > 0) {
            // Extract the remainder when dividing by 2 (binary digit)
            int remainder = decimalNumber % 2;
            // Add the binary digit to the binary number
            binaryNumber += remainder * position;
            // Update the position for the next binary digit
            position *= 10;
            // Divide the decimal number by 2 for the next iteration
            decimalNumber /= 2;
        }

        // Print the binary representation
        System.out.println("Binary Number: " + binaryNumber);
    }
}
