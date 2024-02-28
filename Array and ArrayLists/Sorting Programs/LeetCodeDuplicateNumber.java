// https://leetcode.com/problems/find-the-duplicate-number/description/
// Google Question
// 287. Find the Duplicate Number

public class LeetCodeDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(arr));

    }

    public static int findDuplicate(int[] arr) {
        int ans = -1; // Variable to store the duplicate number, initialized to -1
        int i = 0; // Pointer for iteration through the array

        // ----------------------- Method1 -----------------------------
        // This method uses swapping to place each number at its correct index
        // and then checks for the number that's not at its correct index
        // It is commented out because it modifies the array, violating the problem
        // constraints

        // while (i < arr.length) {
        // int correct = arr[i] - 1;
        // if (arr[correct] != arr[i]) {
        // int temp = arr[i];
        // arr[i] = arr[correct];
        // arr[correct] = temp;
        // } else {
        // i++;
        // }
        // }

        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] - 1 != j) {
        // ans = arr[j];
        // }
        // }

        // ----------------------- Method2 -----------------------------
        // This method implements Floyd's Tortoise and Hare algorithm
        // to detect a cycle in the array
        while (i < arr.length) {
            int correct = arr[i] - 1; // Calculate the correct index for the current element

            // Check if the current element is already at its correct index
            if (arr[i] != i + 1) {
                // If not, swap the current element with the element at its correct index
                if (arr[correct] != arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    // If the element at its correct index is already the same as the current
                    // element,
                    // it means we've found the duplicate
                    ans = arr[i];
                    break;
                }
            } else {
                i++; // Move to the next element if the current one is already at its correct index
            }
        }

        return ans; // Return the duplicate number found
    }
}
