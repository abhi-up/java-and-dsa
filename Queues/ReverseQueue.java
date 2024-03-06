import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        // Creating a queue and a stack
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        // Printing the elements of the queue before rearranging
        System.out.println("Before: " + queue);

        // Moving elements from the queue to the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Moving elements from the stack back to the queue
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Printing the elements of the queue after rearranging
        System.out.println("After: " + queue);
    }
}
