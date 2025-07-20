package sortingalgorithms;

import java.util.*;

public class CountingSortAges {

    public static void countingSort(int[] ages) {
        int min = 10, max = 18;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // count frequency of each age
        for (int age : ages) {
            count[age - min]++;
        }

        // compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // place elements into output array
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        // copy sorted data back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter student ages (between 10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        countingSort(ages);

        System.out.println("Sorted student ages:");
        System.out.println(Arrays.toString(ages));
    }
}
