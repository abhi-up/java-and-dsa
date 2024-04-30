import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        if (isPalindromeRecursive(str.toLowerCase(), 0)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    // ============================ BRUTE FORCE ================================
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length();

        while (i < j) {
            if (str.charAt(i) != str.charAt(j - 1)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // ================================ BETTER WAY ============================
    public static boolean isPalindromeRecursive(String str, int i) {
        if (i >= str.length() / 2)
            return true;

        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;

        return isPalindromeRecursive(str, i + 1);

    }
}
