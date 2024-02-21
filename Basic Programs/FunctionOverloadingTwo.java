/* In this optimized version of "FunctionOverloadingOne.java" program, a varargs parameter is used in the add methods, allowing them to accept any number of arguments. This eliminates the need for separate methods for adding two or three integers. The method iterates over the provided arguments and calculates the sum accordingly. This approach reduces code duplication and enhances maintainability. */

public class FunctionOverloadingTwo {
    // Method to add integers
    public static int add(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    // Method to add floats
    public static float add(float... nums) {
        float sum = 0;
        for (float num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Calling the overloaded methods and storing the results
        int sum1 = add(3, 5); // Calls the add method with two integers
        int sum2 = add(3, 5, 8); // Calls the add method with three integers
        float sum3 = add(3.3f, 5.1f); // Calls the add method with two floats

        // Printing the results
        System.out.println("Sum of 2 integers: " + sum1);
        System.out.println("Sum of 3 integers: " + sum2);
        System.out.println("Sum of 2 decimals: " + sum3);
    }
}
