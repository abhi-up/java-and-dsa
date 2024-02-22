
public class StaticKeyword {

    public static class Example {
        // Static variable
        static int count = 0;

        // Instance variable
        int id;

        // Constructor
        Example() {
            id = count++; // Assigns the current value of count to id and then increments count
        }

        // Static method
        static void incrementCount() {
            count++;
        }

        // Instance method
        void display() {
            System.out.println("ID: " + id);
            System.out.println("Count: " + count);
        }
    }

    public static void main(String[] args) {
        Example example1 = new Example();
        Example example2 = new Example();

        example1.display(); // Displays ID: 0, Count: 2
        example2.display(); // Displays ID: 1, Count: 2

        Example.incrementCount(); // Calling static method

        example1.display(); // Displays ID: 0, Count: 3
        example2.display(); // Displays ID: 1, Count: 3
    }
}
