public class LinkedListClass {
    // Node Class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Linked List Class
    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // Method to insert a node at the end of the linked list
        void insertAtEnd(int val) {
            Node temp = new Node(val);

            // If the list is empty, make the new node as head
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            // Update the tail to the new node
            tail = temp;
        }

        // Method to insert a node at the beginning of the linked list
        void insertAtHead(int val) {
            Node temp = new Node(val);

            // If the list is empty, insert the node at the end
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Method to insert a node at a specific position in the linked list
        void insert(int pos, int val) {
            Node temp1 = new Node(val);

            // If position is 0, insert at the head
            if (pos == 0) {
                insertAtHead(val);
            } else if (pos >= this.size()) { // If position is greater than or equal to size, insert at the end
                insertAtEnd(val);
            } else {
                Node temp2 = head;

                // Traverse to the node before the desired position
                while (pos != 1) {
                    temp2 = temp2.next;
                    pos--;
                }

                // Insert the new node
                temp1.next = temp2.next;
                temp2.next = temp1;
            }
        }

        // Method to display the elements of the linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Method to get the size of the linked list
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // Method to get the element at a specific index in the linked list
        int getElement(int idx) {
            if (idx < 0 || idx >= this.size()) {
                return -1;
            }

            Node temp = head;
            while (idx != 0) {
                temp = temp.next;
                idx--;
            }
            return temp.data;
        }

        // Method to delete a node at a specific index in the linked list
        void deleteAtIndex(int idx) {
            if (idx < 0 || idx >= this.size()) {
                System.out.println("Index out of bounds.");
                return;
            }
            if (idx == 0) {
                head = head.next;
                return;
            }

            Node temp = head;

            // Traverse to the node before the node to be deleted
            while (idx != 1) {
                temp = temp.next;
                idx--;
            }

            // Delete the node by updating the pointers
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(5);
        ll.insertAtEnd(8);

        ll.display();

        System.out.println("Size of the linked list: " + ll.size());

        ll.insertAtHead(2);

        ll.display();

        ll.insert(1, 7);

        ll.display();

        System.out.println("Element at index 3: " + ll.getElement(3));

        ll.display();
        ll.deleteAtIndex(0);
        ll.display();

    }
}
