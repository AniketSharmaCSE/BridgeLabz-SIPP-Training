package setinterface;
import java.util.*;


public class equalSets {
	public static <T> boolean areSetsEqual(Set<T> s1, Set<T> s2) {
        if(s1 == null || s2 == null) {
        	return false;
        }
        return s1.equals(s2);
    }

	    public static void main(String[] args) {
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();

	        set1.add(1);
	        set1.add(2);
	        set1.add(3);

	        set2.add(3);
	        set2.add(2);
	        set2.add(1);

	        boolean areEqual = areSetsEqual(set1, set2);

	        System.out.println(areEqual);
	    }

	    
	}


