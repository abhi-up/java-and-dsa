import java.util.LinkedList;
import java.util.Queue;

public class BuiltInLLQueue {
    public static void main(String[] args) {
        // Creating a queue
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("John");
        queue.offer("Alice");
        queue.offer("Bob");

        // Printing the elements of the queue
        System.out.println("Queue: " + queue); // Output: Queue: [John, Alice, Bob]

        // Removing and printing the head of the queue
        System.out.println("Removed element: " + queue.poll()); // Output: Removed element: John

        // Printing the head of the queue without removing it
        System.out.println("Head of the queue: " + queue.peek()); // Output: Head of the queue: Alice

        // Printing the size of the queue
        System.out.println("Size of the queue: " + queue.size()); // Output: Size of the queue: 2
    }
}
