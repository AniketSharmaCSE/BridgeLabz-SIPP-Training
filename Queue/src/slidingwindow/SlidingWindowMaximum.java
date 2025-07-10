package slidingwindow;

import java.util.*;

public class SlidingWindowMaximum {

    public int[] maxInSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) return new int[0];

        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove elements out of this window
            if (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current element index
            dq.offer(i);

            // Record the max value once window is full
            if (i >= k - 1) {
                result[i - k + 1] = arr[dq.peek()];
            }
        }

        return result;
    }
}
