// 142. Linked List Cycle II

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

public class LeetCodeCycle2 {
    public static void main(String[] args) {
        // Create a linked list: 3 -> 2 -> 0 -> -4, with a cycle connecting -4 back to 2
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = node2; // Create a cycle here

        // Instantiate the solution and detect the cycle
        LeetCodeCycle2 solution = new LeetCodeCycle2();
        ListNode cycleStart = solution.detectCycle(head);

        // Print the result
        if (cycleStart != null) {
            System.out.println("Cycle detected at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }

        // Create a linked list without a cycle: 1 -> 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        // Check for a cycle in the second list
        ListNode cycleStart2 = solution.detectCycle(head2);

        // Print the result
        if (cycleStart2 != null) {
            System.out.println("Cycle detected at node with value: " + cycleStart2.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            slow = slow.next;
            if (fast.next == null)
                return null;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        ListNode temp = head;

        while (temp != slow) {
            if (slow == null)
                return null;
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }
}
