// Write a program to multiply two matrices.

import java.util.Arrays;

public class MatrixMult {
    public static void matrixProduct(int[][] m1, int[][] m2) {
        if (m1[0].length != m2.length) {
            System.out.println("Multiplication cannot be performed.");
            return;
        }

        int[][] result = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[][] m1 = { { 0, 3, 5 }, { 5, 5, 2 } };
        int[][] m2 = { { 3, 4 }, { 3, -2 }, { 4, 2 } };

        matrixProduct(m1, m2);
    }
}
