public class RemoveVowels {
    public static void main(String[] args) {
        String str = "take u forward";

        System.out.println("Original String: " + str);

        String newStr = removeVowels(str);
        System.out.println("New String: " + newStr);
    }

    private static String removeVowels(String str) {
        int len = str.length();
        String newStr = "";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                continue;
            }

            newStr += ch;
        }
        return newStr;

    }
}
