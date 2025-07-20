package sortingalgorithms;

import java.util.Scanner;
import java.util.Arrays;

public class SelectionSortScores {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        // Selection Sort logic: select the minimum and place it at correct position
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // swap if a smaller value was found
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        selectionSort(scores);

        System.out.println("Sorted exam scores in ascending order:");
        System.out.println(Arrays.toString(scores));
    }
}
