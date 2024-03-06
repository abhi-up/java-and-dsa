import java.util.ArrayDeque;
import java.util.Deque;

public class BuiltInStackClassTwo {
    public static void main(String[] args) {
        // Creating a stack using ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping elements from the stack
        System.out.println("Popping: " + stack.pop()); // Output: 30
        System.out.println("Popping: " + stack.pop()); // Output: 20

        // Peeking at the top element of the stack
        System.out.println("Top element: " + stack.peek()); // Output: 10

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
