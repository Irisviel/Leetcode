/*
 * 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/description/
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 * Constraints:
 * The number of nodes in the list is in the range [1, 10e5].
 * 0 <= Node.val <= 9
 * Follow up: Could you do it in O(n) time and O(1) space?
 */

class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        // More edge cases for the god of edge cases
        if (head.next == null) return true;                                         // I...
        if (head.next.next == null) return (head.val == head.next.val);             // said...
        if (head.next.next.next == null) return (head.val == head.next.next.val);   // more!!!...

        ListNode middle = middleNode(head);
        ListNode middleReversed = reverse(middle);

        ListNode one = head;
        ListNode two = middleReversed;
        do {
            if (one.val != two.val) return false;
            one = one.next;
            two = two.next;
        } while (one != null && two != null);

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode input = head.next;
        current.next = null;
        while (input != null) {
            ListNode temp = input.next;
            input.next = current;
            current = input;
            input = temp;
        }
        return current;
    }

    // "Fast and Slow pointer"
    private ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // moving fast by 2 step
            slow = slow.next;
        }
        return slow;
    }

    public static class ListNode {
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
}