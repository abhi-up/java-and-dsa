import java.util.*;

public class LeetCodeRelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };

        int[] sortedArr1 = relativeSortArray(arr1, arr2);

        System.out.println(Arrays.toString(sortedArr1));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: Create a map to record the order of each element in arr2
        Map<Integer, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            orderMap.put(arr2[i], i);
        }

        // Step 2: Create two lists to partition arr1
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> notInOrder = new ArrayList<>();

        for (int num : arr1) {
            if (orderMap.containsKey(num)) {
                inOrder.add(num);
            } else {
                notInOrder.add(num);
            }
        }

        // Step 3: Sort inOrder list based on the order defined in arr2
        inOrder.sort(Comparator.comparingInt(orderMap::get));

        // Step 4: Sort notInOrder list in ascending order
        Collections.sort(notInOrder);

        // Step 5: Combine both lists
        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : inOrder) {
            result[index++] = num;
        }

        for (int num : notInOrder) {
            result[index++] = num;
        }

        return result;
    }
}
