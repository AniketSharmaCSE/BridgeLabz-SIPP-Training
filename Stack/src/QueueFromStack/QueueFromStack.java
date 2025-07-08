package QueueFromStack;

import java.util.Stack;

public class QueueFromStack {
    Stack<Integer> stack1 = new Stack<>(); // for enqueue
    Stack<Integer> stack2 = new Stack<>(); // for dequeue

    // Add element to queue
    public void enqueue(int data) {
        stack1.push(data);
    }

    // Remove and return front element of queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek front element without removing
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
