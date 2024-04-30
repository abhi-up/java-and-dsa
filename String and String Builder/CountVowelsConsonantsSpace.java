
public class CountVowelsConsonantsSpace {
    public static void main(String[] args) {
        String str = "India won the cricket match";

        str = str.toLowerCase();

        System.out.println("Vowels: " + countVowels(str));
        System.out.println("Consonants: " + countConsonants(str));
        System.out.println("Spaces: " + countSpaces(str));
    }

    private static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count++;
        }
        return count;
    }

    private static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                    count++;
            }
        }
        return count;
    }

    private static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }
}
