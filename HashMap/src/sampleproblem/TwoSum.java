package sampleproblem;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // HashMap to store value and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // checking for target - current element in map
        for (int i = 0; i < n; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                System.out.println("Indices: " + map.get(need) + " and " + i);
                return;
            }
            map.put(arr[i], i);
        }

        System.out.println("No such pair of indices found.");
    }
}
