// 237. Delete Node in a Linked List

public class LeetCodeDeleteNode {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print the linked list before deletion
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        deleteNode(head.next.next);

        // Print the linked list after deletion
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}