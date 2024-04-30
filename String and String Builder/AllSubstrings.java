import java.util.Scanner;

public class AllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        printSubstrings(str);

        sc.close();
    }

    public static void printSubstrings(String str) {
        int length = str.length();

        for (int start = 0; start < length; start++) {
            for (int end = start + 1; end <= length; end++) {
                System.out.print(str.substring(start, end) + " ");
            }
        }
    }
}
