public class AddMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix2 = { { 7, 8, 9 }, { 10, 11, 12 } };

        int[][] result = addMatrices(matrix1, matrix2);

        // Displaying the result
        System.out.println("Resultant Matrix:");
        displayMatrix(result);
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m1[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
