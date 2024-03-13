// https://leetcode.com/problems/find-the-pivot-integer/solutions/4866557/easy-explanation-basic-math-beats-100-c-java-python3/?envType=daily-question&envId=2024-03-13
// Find the pivot integer

public class LeetCodePivotInteger {

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {
        int leftSum = 0; // Initialize the sum of elements to the left
        int rightSum = 0; // Initialize the sum of elements to the right

        // Iterate through each integer from 1 to n
        for (int i = 1; i <= n; i++) {
            leftSum = i * (i + 1) / 2; // Calculate the sum of elements to the left
            rightSum = n * (n + 1) / 2 - i * (i - 1) / 2; // Calculate the sum of elements to the right

            // Check if the sum of elements to the left equals the sum of elements to the
            // right
            if (leftSum == rightSum) {
                return i; // If they are equal, return the pivot integer
            }
        }

        return -1; // If no pivot integer is found, return -1
    }
}