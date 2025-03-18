import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @noinspection SimplifiableAssertion
 */
public class PalindromeLinkedListTest {

    PalindromeLinkedList test = new PalindromeLinkedList();

    PalindromeLinkedList.ListNode createLinkedList(int[] input) {
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(input[0]);
        PalindromeLinkedList.ListNode current = head;
        for (int i = 1; i < input.length; i++) {
            current.next = new PalindromeLinkedList.ListNode(input[i]);
            current = current.next;
        }
        return head;
    }

    @Test
    void isPalindrome2() {
        assertEquals(false, test.isPalindrome(createLinkedList(new int[]{1, 2})));
    }

    @Test
    void isPalindrome3() {
        assertEquals(true, test.isPalindrome(createLinkedList(new int[]{1, 2, 1})));
    }

    @Test
    void isPalindrome4() {
        assertEquals(true, test.isPalindrome(createLinkedList(new int[]{1, 2, 2, 1})));
    }

    @Test
    void isPalindrome51() {
        assertEquals(false, test.isPalindrome(createLinkedList(new int[]{1, 2, 2, 1, 1})));
    }

    @Test
    void isPalindrome52() {
        assertEquals(true, test.isPalindrome(createLinkedList(new int[]{1, 2, 2, 2, 1})));
    }

    @Test
    void isPalindrome53() {
        assertEquals(true, test.isPalindrome(createLinkedList(new int[]{2, 2, 2, 2, 2})));
    }

    @Test
    void isPalindrome54() {
        assertEquals(true, test.isPalindrome(createLinkedList(new int[]{3, 5, 7, 5, 3})));
    }

    @Test
    void isPalindrome55() {
        assertEquals(false, test.isPalindrome(createLinkedList(new int[]{3, 5, 7, 5, 1})));
    }

    @Test
    void isPalindrome61() {
        assertEquals(true, test.isPalindrome(createLinkedList(new int[]{3, 5, 7, 7, 5, 3})));
    }

    @Test
    void isPalindrome62() {
        assertEquals(true, test.isPalindrome(createLinkedList(new int[]{3, 7, 7, 7, 7, 3})));
    }

    @Test
    void isPalindrome63() {
        assertEquals(false, test.isPalindrome(createLinkedList(new int[]{1, 7, 7, 7, 7, 3})));
    }

    @Test
    void isPalindrome64() {
        assertEquals(false, test.isPalindrome(createLinkedList(new int[]{3, 5, 7, 9, 5, 3})));
    }
}
