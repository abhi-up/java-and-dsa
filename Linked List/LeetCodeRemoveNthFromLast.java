import java.util.Scanner;

public class LeetCodeRemoveNthFromLast {

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

    public static int size(ListNode head) {
        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;

        // Step 1: Traverse the linked list to find its length
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Reset temp to the head of the list
        temp = head;
        ListNode prev = null;
        int pos = len - n;

        // Special case: If the node to be removed is the head itself
        if (pos == 0)
            return head.next;

        // Step 2: Traverse the list again to reach the node just before the one to be
        // removed
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }

        // Step 3: Update the pointers to remove the node
        prev.next = temp.next;

        // Step 4: Delete the removed node
        temp = null;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = createLinkedList();
        System.out.println("Linked list created:");
        displayLinkedList(head);
        System.out.println("The size of the LL is: " + size(head));
        head = removeNthFromEnd(head, 2);
        displayLinkedList(head);

    }

}
