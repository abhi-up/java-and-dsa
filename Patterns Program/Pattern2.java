// Hollow Rectangle
// *****
// *   *
// *   *
// *****

public class Pattern2 {
    public static void main(String[] args) {
        int m = 4, n = 5;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == n || i == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
