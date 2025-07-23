package listinterface;
import java.util.*;

public class ReverseList {
		public static void reverseList(List<Integer> list) {
			int n = list.size();		
			for(int i = 0; i< n/2; i++) {
				//swap elements from front and end
				int temp = list.get(i);
				list.set(i, list.get(n-1-i));
				list.set(n-1-i, temp);
				
			}
		
		
		}

			public static void main(String[] args) {
				//List interface allows both arraylist and linkedlist as input
				ArrayList<Integer> arrlist = new ArrayList<>();
				arrlist.add(8);
				arrlist.add(7);
				arrlist.add(9);
				arrlist.add(1);
				System.out.println("Original list");
				System.out.println(arrlist);
				reverseList(arrlist);
				System.out.println("Reversed for ArrayList");
				System.out.println(arrlist);
				LinkedList<Integer> linkedlist = new LinkedList<>();
				linkedlist.add(4);
				linkedlist.add(9);
				linkedlist.add(5);
				linkedlist.add(6);
				System.out.println("Original list");
				System.out.println(linkedlist);
				reverseList(linkedlist);
				System.out.println("Reversed for LinkedList");
				System.out.println(linkedlist);		
			}
}
