/* This program demonstrates function overloading, where multiple methods with the same name are defined but differ in the number or type of their parameters. In this case, there are three add methods: one for adding two integers, one for adding three integers, and one for adding two floats. The appropriate method is called based on the arguments passed to it. */

public class FunctionOverloadingOne {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two floats
    public static float add(float a, float b) {
        return a + b;
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
