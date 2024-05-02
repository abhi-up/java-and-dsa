import java.util.*;

public class UnionOfSortedArrays {
    // Function to find the union of two sorted arrays
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;
        int m = arr1.length;
        int n = arr2.length;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (!union.contains(arr2[j])) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                // If both elements are equal, add only one and move both pointers
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements of array1
        while (i < m) {
            if (!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of array2
        while (j < n) {
            if (!union.contains(arr2[j])) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 7 };
        int[] arr2 = { 2, 3, 5, 6 };

        ArrayList<Integer> union = findUnion(arr1, arr2);

        System.out.println("Union of the two arrays: " + union);
    }
}
