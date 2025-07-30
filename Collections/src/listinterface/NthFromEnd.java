package listinterface;
import java.util.*;



public class NthFromEnd {
	
	 public static <T> T getNthFromEnd(LinkedList<T> list, int n) {
	        if (list == null || n <= 0) return null;

	        int lead = 0;
	        int follow = 0;

	        while (lead < n) {
	            if (lead >= list.size()) {
	                return null; // n is bigger than list size
	            }
	            lead++;
	        }

	        while (lead < list.size()) {
	            lead++;
	            follow++;
	        }

	        return list.get(follow);
	    }
	 
	 
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        String result = getNthFromEnd(list, n);

        if (result != null) {
            System.out.println(n + "th element from end: " + result);
        } else {
            System.out.println("Invalid input");
        }
    }

   
}
