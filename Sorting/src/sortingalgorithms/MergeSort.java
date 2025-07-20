package sortingalgorithms;

import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {
    
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively divide both halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    private static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArr = new double[n1];
        double[] rightArr = new double[n2];

        // Copy data to temp arrays
        System.arraycopy(prices, left, leftArr, 0, n1);
        System.arraycopy(prices, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;

        // Merge temp arrays back into prices[]
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k++] = leftArr[i++];
            } else {
                prices[k++] = rightArr[j++];
            }
        }

        // Copy any remaining elements
        while (i < n1) prices[k++] = leftArr[i++];
        while (j < n2) prices[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        double[] prices = new double[n];
        System.out.println("Enter the prices of " + n + " books:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        mergeSort(prices, 0, n - 1);

        System.out.println("Sorted book prices in ascending order:");
        System.out.println(Arrays.toString(prices));
    }
}
