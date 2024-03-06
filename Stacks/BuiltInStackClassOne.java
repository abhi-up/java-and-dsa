import java.util.Stack;

public class BuiltInStackClassOne {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Iterating over the elements of the stack
        System.out.println("Elements of the stack:");
        for (Integer element : stack) {
            System.out.println(element);
        }

        // Popping elements from the stack
        System.out.println("\nPopping: " + stack.pop()); // Output: 30
        System.out.println("Popping: " + stack.pop()); // Output: 20

        // Peeking at the top element of the stack
        System.out.println("\nTop element: " + stack.peek()); // Output: 10

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
