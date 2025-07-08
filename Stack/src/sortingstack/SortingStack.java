package sortingstack;

import java.util.Stack;

public class SortingStack {

    // Main function to sort the stack
    public void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();             // pop top element
            sortStack(stack);                  // sort the rest
            insertInSortedOrder(stack, top);   // insert the popped element back correctly
        }
    }

    // function to insert an element into the sorted stack
    private void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertInSortedOrder(stack, value);
            stack.push(temp);
        }
    }
}
