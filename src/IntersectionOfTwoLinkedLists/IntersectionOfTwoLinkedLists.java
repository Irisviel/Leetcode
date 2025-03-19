/*
 * 160. Intersection of Two Linked Lists
 * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 *
 * Constraints:
 * The number of nodes of listA is in the m.
 * The number of nodes of listB is in the n.
 * 1 <= m, n <= 3 * 10e4
 * 1 <= Node.val <= 10e5
 * Follow up: Could you write a solution that runs in O(m + n) time and use only O(1) memory?
 */

package IntersectionOfTwoLinkedLists;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        int sizeA = 1;
        while (A.next != null) {
            A = A.next;
            sizeA++;
        }
        ListNode B = headB;
        int sizeB = 1;
        while (B.next != null) {
            B = B.next;
            sizeB++;
        }

        A = headA;
        B = headB;
        if (sizeA > sizeB) {
            for (int i = 0; i < sizeA - sizeB; i++) {
                A = A.next;
            }
        } else if (sizeA < sizeB) {
            for (int i = 0; i < sizeB - sizeA; i++) {
                B = B.next;
            }
        }

        while (A != null && B != null) {
            if (A == B) {
                return A;
            }
            A = A.next;
            B = B.next;
        }

        return null;
    }
}