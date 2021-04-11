package leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 */
public final class AddTwoNumbers {

    private AddTwoNumbers() {
        // prevent instantiation
    }

    /**
     * This method checks if the array is empty.
     *
     */
    static class ListNode {
        /** The HashMap containing the adjacent nodes. */
        int val;
        /** The HashMap containing the adjacent nodes. */
        ListNode next;

        ListNode(final int x) {
            val = x;
        }
    }

    /**
     * This method checks if the array is empty.
     *
     * @param l1 if the array is empty and false otherwise
     * @param l2 if the array is empty and false otherwise
     * @return t
     */
    public static ListNode addTwoNumbersSolution(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;
        int l1Val;
        int l2Val;
        int sum;
        int carry = 0;
        int digit = 0;

        while (l1 != null || l2 != null) {

            if (l1 != null) {
                l1Val = l1.val;
            } else {
                l1Val = 0;
            }

            if (l2 != null) {
                l2Val = l2.val;
            } else {
                l2Val = 0;
            }

            sum = l1Val + l2Val + carry;
            carry = sum / 10;
            digit = sum % 10;
            ListNode newNode = new ListNode(digit);
            l3.next = newNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            l3 = l3.next;
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = l3.next;
        }
        return dummyHead.next;
    }

}
