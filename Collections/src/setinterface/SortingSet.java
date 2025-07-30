package setinterface;

import java.util.*;

public class SortingSet {
    
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);// Convert set to list
        Collections.sort(list);// Sort the list in ascending order
        return list;
    }
	
	public static void main(String[] args) {
    
    	Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> sortedList = convertToSortedList(set);

        System.out.println(sortedList);
    }


}
