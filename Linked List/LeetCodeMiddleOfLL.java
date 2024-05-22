// 876. Middle of the Linked List
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

public class Solution {
    public static ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;

        // Calculate the size of the linked list
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Calculate the middle index (0-based index)
        int middle = size / 2;
        temp = head;

        // Move to the middle node
        while (middle != 0) {
            temp = temp.next;
            middle--;
        }

        return temp;
    }
}

public class LeetCodeMiddleOfLL {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Find the middle node
        ListNode middle = Solution.middleNode(head);
        System.out.println("The middle node's value is: " + middle.val);

        // Create another linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);

        // Find the middle node of the second list
        ListNode middle2 = Solution.middleNode(head2);
        System.out.println("The middle node's value is: " + middle2.val);
    }
}
