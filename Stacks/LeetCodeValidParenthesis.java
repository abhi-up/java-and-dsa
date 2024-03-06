import java.util.Stack;

public class LeetCodeValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>(); // Creating a stack to store opening brackets

        for (int i = 0; i < s.length(); i++) { // Looping through each character of the string
            char ch = s.charAt(i); // Getting the current character

            if (ch == '(' || ch == '[' || ch == '{') // If it's an opening bracket, push it onto the stack
                st.push(ch);

            else if (st.isEmpty()) // If it's a closing bracket but the stack is empty, it's invalid
                return false;

            else if (st.peek() == '(' && ch == ')') // If it's a closing bracket and matches the top of the stack, pop
                                                    // it
                st.pop();

            else if (st.peek() == '{' && ch == '}') // Same for curly braces
                st.pop();

            else if (st.peek() == '[' && ch == ']') // Same for square brackets
                st.pop();

            else // If it's a closing bracket that doesn't match the top of the stack, it's
                 // invalid
                return false;
        }

        // If the stack is empty after processing all characters, it's valid, otherwise,
        // it's invalid
        return st.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
