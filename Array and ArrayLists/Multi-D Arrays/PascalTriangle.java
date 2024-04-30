import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input: value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Function call
        int[][] result = pascalTriangle(n);

        // Printing the pascal's triangle
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] pascalTriangle(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == j || j == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i - 1][j - 1];
                }
            }
        }
        return matrix;
    }
}
