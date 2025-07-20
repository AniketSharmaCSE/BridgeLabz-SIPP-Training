package sampleproblem;

import java.util.*;

public class PairWithSum {
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

        boolean found = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int need = target - arr[i];
            if (map.containsKey(need)) {
                System.out.println("Pair found: " + arr[i] + " and " + need);
                found = true;
                break;
            }
            map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}
