
class ListNode {
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

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // If the list has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize two pointers, slow and fast
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Traverse the list with the two pointers
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Remove the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }
}

public class LeetCodeDeleteMiddleNodeOfLL {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Instantiate the solution and delete the middle node
        Solution solution = new Solution();
        head = solution.deleteMiddle(head);

        // Print the result
        printList(head);

        // Create another linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);

        // Delete the middle node of the second list
        head2 = solution.deleteMiddle(head2);

        // Print the result
        printList(head2);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
