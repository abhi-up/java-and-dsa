import java.util.Arrays;

public class TransposeInplaceMatrix {

    public static void findTranspose(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Square matrix only
        int[][] matrix = { { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 } };

        System.out.println("Original Matrix:");
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }

        findTranspose(matrix);

        System.out.println("Transpose Matrix:");
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
