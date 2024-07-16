// 1 2 1 2 1 2
// 2 1 2 1 2 1
// 1 2 1 2 1 2
// 2 1 2 1 2 1

public class Pattern9 {
    public static void main(String[] args) {
        int m = 4, n = 6;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1 + " ");
                    continue;
                }
                System.out.print(2 + " ");
            }
            System.out.println();
        }
    }
}
