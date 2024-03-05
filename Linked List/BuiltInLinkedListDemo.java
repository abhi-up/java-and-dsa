import java.util.LinkedList;

public class BuiltInLinkedListDemo {
    public static void main(String[] args) {
        // Creating a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Adding an element at a specific index
        linkedList.add(2, "Mango");
        System.out.println("After adding Mango at index 2: " + linkedList);

        // Removing an element at a specific index
        linkedList.remove(1);
        System.out.println("After removing element at index 1: " + linkedList);

        // Getting the first and last elements
        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Checking if an element exists
        boolean containsBanana = linkedList.contains("Banana");
        System.out.println("Does the list contain Banana? " + containsBanana);

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing the list: " + linkedList);
    }
}
