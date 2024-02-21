import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(6);
        numbers.add(669);
        numbers.add(69);

        // Print the list
        System.out.println("Original list: " + numbers);

        // Access an element by index (avoiding potential index out of bounds)
        if (numbers.size() >= 3) {
            System.out.println("Element at index 2 is: " + numbers.get(2));
        } else {
            System.out.println("Index out of bounds for element at index 2.");
        }

        // Insert an element at specific index (using efficient add(index, element)
        // method)
        numbers.add(1, 2);
        System.out.println("List after inserting 2 at index 1: " + numbers);

        // Modify an element at specific index
        numbers.set(3, 7);
        System.out.println("List after setting element at index 3 to 7: " + numbers);

        // Remove an element by index
        numbers.remove(3);
        System.out.println("List after removing element at index 3: " + numbers);

        // Sort the list using the efficient natural ordering of integers
        numbers.sort(null); // Consider customizing sorting if needed
        System.out.println("Sorted list: " + numbers);
    }
}
