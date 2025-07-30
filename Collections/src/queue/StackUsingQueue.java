package queue;

import java.util.*;

public class StackUsingQueue {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return queue1.remove();
    }

    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return queue1.peek();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Top");
            System.out.println("4 - Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed onto stack.");
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped: " + popped);
                    }
                    break;
                case 3:
                    int top = stack.top();
                    if (top != -1) {
                        System.out.println("Top element: " + top);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }
    }
}
