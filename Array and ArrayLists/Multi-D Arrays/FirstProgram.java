import java.util.Arrays;
import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        int[][] arr1 = new int[3][3];

        int[][] arr2 = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };

        // Input
        System.out.println("Enter the elements of the 2-D Array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(i + " index: ");
            for (int j = 0; j < arr2.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Printing the array
        System.out.println("2-D Array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}