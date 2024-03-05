public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Method to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to insert a node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at a specific index of the linked list
    public void insertAtIndex(int data, int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to display the linked list recursively
    public void displayRecursive(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        displayRecursive(node.next);
    }

    // Method to delete a node with given data from the linked list
    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    // Method to find the length of the linked list
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Method to get the data at a specific index of the linked list
    public int getElementAtIndex(int index) {
        if (index < 0 || index >= length()) {
            System.out.println("Invalid index");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Method to delete a node at a specific index of the linked list
    public void deleteNodeAtIndex(int index) {
        if (index < 0 || index >= length()) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Linked list:");
        list.display(); // Display the linked list
        System.out.println("Length of linked list: " + list.length()); // Get length of the linked list
        System.out.println("Element at index 2: " + list.getElementAtIndex(2)); // Get element at index 2

        list.insertAtIndex(5, 2); // Insert element 5 at index 2
        System.out.println("After inserting 5 at index 2:");
        list.display();

        list.deleteNode(3); // Delete node with data 3
        System.out.println("After deleting node with data 3:");
        list.display();

        list.deleteNodeAtIndex(1); // Delete node at index 1
        System.out.println("After deleting node at index 1:");
        list.display();

        System.out.println("Recursive display:");
        list.displayRecursive(list.head); // Display the linked list recursively
    }
}
