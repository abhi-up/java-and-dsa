import java.util.Scanner;

public class LeetCodeReversedLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to create a linked list based on user input
    public static ListNode createLinkedList() {
        Scanner scanner = new Scanner(System.in);
        ListNode head = null;
        ListNode tail = null;

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        scanner.close();
        return head;
    }

    // Method to display the linked list
    public static void displayLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {
        // If the list is empty or has only one node, return head
        if (head == null || head.next == null)
            return head;

        // Recursively reverse the sublist starting from the second node
        ListNode newHead = reverseList(head.next);

        // Reversing the links: setting the next node's next pointer to current node
        head.next.next = head;
        // Setting the current node's next pointer to null to break the original link
        head.next = null;

        // Returning the new head of the reversed list
        return newHead;

    }

    public static void main(String[] args) {
        ListNode head = createLinkedList();
        System.out.println("Linked list created:");
        displayLinkedList(head);
        head = reverseList(head);
        System.out.println("Reversed Linked List: ");
        displayLinkedList(head);
    }
}
