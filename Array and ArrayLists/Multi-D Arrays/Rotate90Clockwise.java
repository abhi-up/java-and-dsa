import java.util.Arrays;

public class Rotate90Clockwise {
    public static void main(String[] args) {
        // Square matrix only
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println("Original Array:");
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }

        rotateClockwise(matrix); // Rotate the matrix clockwise

        System.out.println("Rotated Array:");
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }

    // Method to rotate the matrix clockwise
    public static void rotateClockwise(int[][] matrix) {
        findTranspose(matrix); // Find the transpose of the matrix

        // Reverse each row to rotate the matrix clockwise
        for (int[] a : matrix) {
            reverseArray(a);
        }
    }

    // Method to reverse an array
    public static void reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    // Method to find the transpose of the matrix
    public static void findTranspose(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }
}
