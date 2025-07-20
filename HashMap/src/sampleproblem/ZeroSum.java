package sampleproblem;
import java.util.*;

public class ZeroSum {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 2, -3};
        findZeroSumSubarrays(arr);
    }

    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // To store the final subarrays
        List<List<Integer>> result = new ArrayList<>();

        // Add initial 0 sum to handle subarrays from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    // Create a new subarray from (start+1 to i)
                    List<Integer> subarray = new ArrayList<>();
                    for (int k = start + 1; k <= i; k++) {
                        subarray.add(arr[k]);
                    }
                    result.add(subarray);
                }
            }

            // Add current index to the list of this sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        // Print all subarrays
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }
}
