import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // Create a copy of the heights array
        int[] arr = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }

        // Sort the copied array
        Arrays.sort(arr);

        // Count the number of differences between the original and sorted arrays
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}

public class LeetCodeHeightChecker {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test case
        int[] heights = { 1, 1, 4, 2, 1, 3 };
        int result = solution.heightChecker(heights);

        // Print the result
        System.out.println("Number of students in the wrong positions: " + result);
    }
}
