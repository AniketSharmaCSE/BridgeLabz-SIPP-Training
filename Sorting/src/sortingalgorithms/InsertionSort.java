package sortingalgorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];       // Current ID to insert
            int j = i - 1;

            // Shift elements of the sorted part that are greater than key
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert the key at correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        
        int[] ids = new int[n];
        System.out.println("Enter the Employee IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        insertionSort(ids);

        System.out.println("Sorted Employee IDs in ascending order:");
        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}
