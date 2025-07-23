package listinterface;
import java.util.*;
public class FindFrequency {
		public static Map<String, Integer> Frequency(List<String> list){
			Map<String, Integer> frequency = new HashMap<>();
			for(String item : list) {
				if(frequency.containsKey(item)) {
					int count = frequency.get(item);
					frequency.put(item,  count+1);
				}
				else {
					frequency.put(item, 1);
				}
			}
			return frequency;
		}
		public static void main(String [] args) {
			List<String> items = new ArrayList<>();
			items.add("apple");
			items.add("banana");
			items.add("orange");
			items.add("apple");
			items.add("orange");
			System.out.println("original list: "+ items);
			System.out.println("List with frequency count: "+ Frequency(items));
			
		}
}
