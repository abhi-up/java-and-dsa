import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 7, 8, 9 }, { 10, 11, 12 } };

        int[][] matrixT = transposeMatrix(matrix);

        System.out.println("Original Matrix");
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Transpose Matrix");
        for (int[] arr : matrixT) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] transposeMatrix(int[][] m) {
        int[][] transpose = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                transpose[j][i] = m[i][j];
            }
        }
        return transpose;
    }
}
