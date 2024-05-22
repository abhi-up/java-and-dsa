// 160. Intersection of Two Linked Lists
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either head is null, there is no intersection
        if (headA == null || headB == null) {
            return null;
        }

        int m = 0;
        int n = 0;

        ListNode temp = headA;
        while (temp != null) {
            m++;
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if (m > n) {
            int steps = m - n;
            while (steps != 0) {
                temp1 = temp1.next;
                steps--;
            }
        } else if (n > m) {
            int steps = n = m;
            while (steps != 0) {
                temp2 = temp2.next;
                steps--;
            }
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}

public class LeetCodeIntersectionOfTwoLL {
    public static void main(String[] args) {
        /*
         * Create two linked lists
         * List A: 1 -> 2 -> 3
         * -------------------\
         * --------------------8 -> 9
         * ------------------/
         * List B: --- 4 -> 5
         */
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        ListNode intersection = new ListNode(8);
        headA.next.next.next = intersection;
        intersection.next = new ListNode(9);

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = intersection;

        // Instantiate the solution and find the intersection
        Solution solution = new Solution();
        ListNode result = solution.getIntersectionNode(headA, headB);

        // Print the result
        if (result != null) {
            System.out.println("The intersection node's value is: " + result.val);
        } else {
            System.out.println("There is no intersection node.");
        }
    }
}