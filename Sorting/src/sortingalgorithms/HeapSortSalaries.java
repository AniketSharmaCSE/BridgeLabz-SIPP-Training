package sortingalgorithms;

import java.util.*;

public class HeapSortSalaries {

    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements one by one from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // call max heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // To heapify a subtree rooted at index i
    private static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // find largest among root, left and right
        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        // swap and continue heapifying if root is not largest
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();

        int[] salaries = new int[n];
        System.out.println("Enter expected salary demands:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        heapSort(salaries);

        System.out.println("Sorted salary demands in ascending order:");
        System.out.println(Arrays.toString(salaries));
    }
}
