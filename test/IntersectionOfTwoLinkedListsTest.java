import IntersectionOfTwoLinkedLists.IntersectionOfTwoLinkedLists;
import IntersectionOfTwoLinkedLists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntersectionOfTwoLinkedListsTest {

    IntersectionOfTwoLinkedLists test = new IntersectionOfTwoLinkedLists();

    @Test
    void getIntersectionNode1() {
        ListNode A1 = new ListNode(100);
        ListNode A2 = new ListNode(101);
        ListNode B1 = new ListNode(200);
        ListNode B2 = new ListNode(201);
        ListNode C1 = new ListNode(1000);
        A1.next = A2;
        A2.next = C1;
        B1.next = B2;
        B2.next = C1;
        assertEquals(C1, test.getIntersectionNode(A1, B1));
    }
}