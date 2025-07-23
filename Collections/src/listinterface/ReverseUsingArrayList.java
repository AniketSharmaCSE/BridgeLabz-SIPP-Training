package listinterface;
import java.util.*;

public class ReverseUsingArrayList {
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
				ArrayList<Integer> arrlist = new ArrayList<>();
				arrlist.add(8);
				arrlist.add(7);
				arrlist.add(9);
				arrlist.add(1);
				arrlist.add(9);
				arrlist.add(4);
				arrlist.add(5);
				arrlist.add(6);
				System.out.println(arrlist);
				reverseList(arrlist);
				System.out.println(arrlist);
				
				

			
			
			
			}
}
