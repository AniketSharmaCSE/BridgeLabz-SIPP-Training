package slidingwindow;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        SlidingWindowMaximum helper = new SlidingWindowMaximum();
        int[] result = helper.maxInSlidingWindow(arr, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

