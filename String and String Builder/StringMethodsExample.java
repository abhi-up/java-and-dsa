public class StringMethodsExample {
    public static void main(String[] args) {
        // Define a sample string
        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Character at specific index
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Substring
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Substring with start and end index
        String substringRange = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringRange);

        // Concatenation
        String concatStr = str.concat(" Welcome!");
        System.out.println("Concatenated string: " + concatStr);

        // Replace characters
        String replacedStr = str.replace('l', 'z');
        System.out.println("String after replacement: " + replacedStr);

        // Index of a character or substring
        int indexOfW = str.indexOf('W');
        System.out.println("Index of 'W': " + indexOfW);

        // Check if starts with a specific prefix
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Check if ends with a specific suffix
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithWorld);

        // Convert to uppercase
        String uppercaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseStr);

        // Convert to lowercase
        String lowercaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseStr);

        // Trim leading and trailing whitespaces
        String stringWithSpaces = "   Trim me!   ";
        String trimmedStr = stringWithSpaces.trim();
        System.out.println("Trimmed string: " + trimmedStr);
    }
}
