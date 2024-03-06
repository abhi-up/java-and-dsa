public class MyStackClass {
    public static class MyStack {
        int[] items;
        int top;
        int size;

        MyStack(int size) {
            this.size = size;
            this.items = new int[size];
            this.top = 0;
        }

        public void push(int value) {
            if (top == size - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            items[top] = value;
            top++;
        }

        public int pop() {
            if (top == 0) {
                System.out.println("Stack Underflow");
                return -1;
            }
            top--;
            return items[top];
        }

        public String toString() {
            StringBuilder str = new StringBuilder();

            for (int i = top - 1; i >= 0; i--) {
                str.append(items[i]).append("\n");
            }
            return str.toString();
        }

        public int peek() {
            if (top == 0)
                return -1;
            return items[top - 1];
        }
    }

    public static void main(String[] args) {
        // Creating a custom stack
        MyStack stack = new MyStack(5);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the elements of the stack
        System.out.println(stack); // Output: Stack: 30 20 10

        // Popping an element from the stack
        System.out.println("Popped: " + stack.pop()); // Output: Popped: 30

        // Displaying the elements of the stack after popping
        System.out.println(stack);// Output: Stack: 20 10

        // Peeking at the top element of the stack
        System.out.println("Top element: " + stack.peek()); // Output: Top element: 20
    }
}
