package listinterface;
import java.util.*;
public class RotateElements {
		public static List<Integer> rotate(List<Integer> list, int pos){
			List<Integer>rotated = new ArrayList<>();
			int n = list.size();
			for(int i = pos; i<n; i++ ) {
				rotated.add(list.get(i));
			}
			for(int i = 0; i<pos; i++ ) {
				rotated.add(list.get(i));
			}
			
			
			return rotated;
		}
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(4);
			list.add(3);
			list.add(9);
			list.add(5);
			list.add(2);
			int pos = 2;
			System.out.println("Original list"+list);
			 List<Integer> rotatedList = rotate(list, pos);
			System.out.println("Rotated from position "+pos+":"+rotatedList);
		}
}
