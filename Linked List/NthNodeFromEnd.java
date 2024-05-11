class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int size = 0;

    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Method to print the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteNthNodeFromLast(int pos) {
        Node temp = head;
        int idx = size - pos - 1;

        while (idx != 0) {
            temp = temp.next;
            idx--;
        }
        temp.next = temp.next.next;
    }
}

public class NthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.display(); // Output: 1 2 3 4 5 6

        list.deleteNthNodeFromLast(6);

        list.display(); // Output: 1 2 3 4 6
    }
}
