import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharInString {
    public static char firstNonRepeatedChar(String str) {
        // Create a map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        // If there is no non-repeated character, return '\0' (null character)
        return '\0';
    }

    public static void main(String[] args) {
        String str = "hello";
        char firstNonRepeated = firstNonRepeatedChar(str);
        if (firstNonRepeated != '\0') {
            System.out
                    .println("The first non-repeated character in the string \"" + str + "\" is: " + firstNonRepeated);
        } else {
            System.out.println("There is no non-repeated character in the string \"" + str + "\"");
        }
    }
}
