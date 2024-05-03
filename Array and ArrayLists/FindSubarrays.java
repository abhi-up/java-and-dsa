// Find subarrays with a given sum in array. Given integer array find subarrays with a given sum in it.
// Input: arr= [3,4,-7,1,3,3,1,-4]
//        target = 7

// Output: (3,4) (3,4,-7,1,3,3) (1,3,3) (3,3,1)

import java.util.ArrayList;
import java.util.List;

public class FindSubarrays {
    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;
        List<List<Integer>> result = findSubarraysWithSum(arr, target);
        System.out.println("Output: " + result);
    }

    // ============== BRUTE FORCE ===================
    public static List<List<Integer>> findSubarraysWithSumBrute(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        // Iterate through each index as the start of a potential subarray
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // Iterate through each index after the current start index
            for (int j = i; j < n; j++) {
                // Calculate the sum of elements from the start index to the current index
                sum += arr[j];
                // If the sum equals the target, add the subarray to the result list
                if (sum == target) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        subarray.add(arr[k]);
                    }
                    result.add(subarray);
                }
            }
        }

        return result;
    }

    // ============= OPTIMIZED APPROACH ===============
    public static List<List<Integer>> findSubarraysWithSum(int[] arr, int target) {
        // Initialize result list
        List<List<Integer>> result = new ArrayList<>();

        // Length of the input array
        int n = arr.length;

        // Pointers for sliding window approach
        int start = 0, end = 0;

        // Variable to store the current sum
        int sum = 0;

        // Iterate over the array
        while (end < n) {
            // Add current element to the sum
            sum += arr[end];

            // Shrink the window if the sum exceeds the target
            while (start <= end && sum > target) {
                sum -= arr[start++];
            }

            // If the sum equals the target, add the subarray to the result
            if (sum == target) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                result.add(subarray);
            }

            // Move the end pointer forward
            end++;
        }

        // Return the result
        return result;
    }
}
