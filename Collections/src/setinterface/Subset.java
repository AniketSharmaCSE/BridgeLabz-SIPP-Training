package setinterface;

import java.util.*;

public class Subset {
	
	 public static <T> boolean isSubset(Set<T> subset, Set<T> superset) {
	        if (subset == null || superset == null) return false;
	        return superset.containsAll(subset);
	    }
	 
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean isSubset = isSubset(set1, set2);

        System.out.println(isSubset);
    }

   
}
