import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    @Test
    void test1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin()); // return -3
        minStack.pop();
        assertEquals(0, minStack.top());    // return 0
        assertEquals(-2, minStack.getMin()); // return -2
    }

    @Test
    void test2() {
        MinStack minStack = new MinStack();
        assertEquals(0, minStack.getMin());
        assertEquals(0, minStack.top());
        minStack.pop();
        assertEquals(0, minStack.getMin());
        assertEquals(0, minStack.top());
    }

    @Test
    void test3() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(-2);
        minStack.push(-2);
        minStack.push(-2);
        assertEquals(-2, minStack.getMin());
        assertEquals(-2, minStack.top());
        minStack.pop();
        minStack.pop();
        minStack.pop();
        assertEquals(-2, minStack.getMin());
        assertEquals(-2, minStack.top());
    }
}