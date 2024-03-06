public class MyQueueClass {
    public static class MyQueue {
        private int[] items; // Array to store elements of the queue
        private int size; // Maximum size of the queue
        private int front; // Index of the front element
        private int rear; // Index where the next element will be inserted

        MyQueue(int size) {
            this.items = new int[size]; // Initialize the array with the specified size
            this.size = size; // Set the maximum size of the queue
            this.front = 0; // Initialize front index
            this.rear = 0; // Initialize rear index
        }

        // Method to add an element to the queue
        public void offer(int val) {
            if (rear == size) { // Check if the queue is full
                System.out.println("Queue is full. Cannot add element.");
                return;
            }
            items[rear] = val; // Add the element at the rear position
            rear++; // Move the rear pointer to the next position
        }

        // Method to remove and return the front element from the queue
        public int poll() {
            if (isEmpty()) { // Check if the queue is empty
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1;
            }
            int polledValue = items[front]; // Get the front element
            front++; // Move the front pointer to the next position
            return polledValue; // Return the removed element
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return front == rear; // If front and rear are equal, the queue is empty
        }

        // Method to convert the queue to a string for printing
        public String toString() {
            StringBuilder str = new StringBuilder();
            for (int j = front; j < rear; j++) { // Iterate from front to rear
                str.append(items[j]).append("\n"); // Append each element to the string
            }
            return str.toString(); // Return the string representation of the queue
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5); // Create a queue with maximum size 5

        // Add elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        // Remove and print the front element of the queue
        System.out.println("Dequeued: " + queue.poll());

        // Print the elements of the queue
        System.out.print(queue);
    }
}
