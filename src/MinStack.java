/*
 * 155. Min Stack
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * Implement the MinStack class:
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 */

/*
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        stack.push(val);
        if (min.isEmpty())
            min.push(val);
        else
            min.push(Math.min(val, min.peek()));
    }

    public void pop() {
        if (!stack.isEmpty()) stack.pop();
        if (!min.isEmpty()) min.pop();
    }

    public int top() {
        if (!stack.isEmpty())
            return stack.peek();
        else return 0;
    }

    public int getMin() {
        if (!min.isEmpty())
            return min.peek();
        else return 0;
    }
}

