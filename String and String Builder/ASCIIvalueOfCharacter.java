import java.util.Scanner;

public class ASCIIvalueOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character to find its ASCII values: ");
        char ch = sc.nextLine().charAt(0);

        System.out.println("ASCII value of " + ch + "is: " + asciiValue(ch));

        sc.close();
    }

    private static int asciiValue(char ch) {
        return (int) ch;
    }
}
