package queue;

import java.util.*;

public class ReverseAQueue {

    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        // Remove front element
        int front = queue.remove();

        // Recursively reverse the remaining queue
        reverse(queue);

        // Add removed element to the rear
        queue.add(front);
    }
	
	public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original queue: " + queue);

        reverse(queue);

        System.out.println("Reversed queue: " + queue);
    }


}

