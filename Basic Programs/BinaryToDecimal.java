public class BinaryToDecimal {
    public static void main(String[] args) {

        // -----------------------------FIRST METHOD--------------------------------

        // Binary number to convert
        int binaryNumber = 1011;
        // Initialize the decimal number
        int decimalNumber = 0;
        // Initialize the exponent for the current binary digit
        int exponent = 0;

        // Iterate through each digit of the binary number
        while (binaryNumber > 0) {
            // Extract the last digit of the binary number
            int lastDigit = binaryNumber % 10;
            // Remove the last digit from the binary number
            binaryNumber /= 10;
            // Calculate the decimal value of the current binary digit and add it to the
            // decimal number
            decimalNumber += lastDigit * (int) Math.pow(2, exponent);
            // Increment the exponent for the next binary digit
            exponent++;
        }
        // Print the resulting decimal number
        System.out.println("Decimal Number: " + decimalNumber);

        // -----------------------------SECOND METHOD--------------------------------

        /*
         * In this optimized version, we remove the need for Math.pow() by using a
         * variable exponent to keep track of the current power of 2. This avoids the
         * computational overhead of using the Math.pow() method repeatedly in each
         * iteration of the loop, resulting in improved performance. Additionally, we
         * initialize exponent to 1 instead of 0, eliminating the need to multiply by 2
         * in the first iteration of the loop. This simplifies the calculation and
         * reduces the number of operations needed.
         */

        // Initialize the exponent for the current binary digit
        int exponent2 = 1;
        // Re-initialize the binary number
        binaryNumber = 1011;
        // Re-initialize the decimal number to 0
        decimalNumber = 0;
        // Iterate through each digit of the binary number
        while (binaryNumber > 0) {
            // Extract the last digit of the binary number
            int lastDigit = binaryNumber % 10;
            // Add the decimal value of the current binary digit to the total
            decimalNumber += lastDigit * exponent2;
            // Remove the last digit from the binary number
            binaryNumber /= 10;
            // Update the exponent for the next binary digit
            exponent2 *= 2;
        }

        // Print the resulting decimal number
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
