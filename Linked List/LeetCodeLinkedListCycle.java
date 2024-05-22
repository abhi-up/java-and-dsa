// 141. Linked List Cycle

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LeetCodeLinkedListCycle {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 2 (cycle back to node with
        // value 2)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next; // Create a cycle here

        // Instantiate the solution and check for a cycle
        LeetCodeLinkedListCycle solution = new LeetCodeLinkedListCycle();
        boolean hasCycle = solution.hasCycle(head);

        // Print the result
        System.out.println("Does the linked list have a cycle? " + hasCycle);

        // Create a linked list without a cycle: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        // Check for a cycle in the second list
        boolean hasCycle2 = solution.hasCycle(head2);

        // Print the result
        System.out.println("Does the linked list have a cycle? " + hasCycle2);
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Use Floyd's cycle-finding algorithm (Tortoise and Hare)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
