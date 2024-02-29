public class StringBuilderProgram {
    public static void main(String[] args) {
        // Create a StringBuilder object with initial content "Hello"
        StringBuilder sb = new StringBuilder("Hello");

        // Append " World" to the StringBuilder
        sb.append(" World");

        // Insert "Java" at index 6
        sb.insert(6, "Java");

        // Delete characters from index 5 to 9 (inclusive)
        sb.delete(5, 10);

        // Replace characters from index 0 to 4 with "Hi"
        sb.replace(0, 5, "Hi");

        // Get a substring from index 3 to 7
        String sub = sb.substring(3, 7);

        // Get the length of the StringBuilder
        int length = sb.length();

        // Get and set characters at specific positions
        char ch = sb.charAt(0);
        sb.setCharAt(0, 'J');

        // Print the modified StringBuilder and other results
        System.out.println("Modified StringBuilder: " + sb);
        System.out.println("Substring: " + sub);
        System.out.println("Length: " + length);
        System.out.println("Character at index 0: " + ch);
    }
}
