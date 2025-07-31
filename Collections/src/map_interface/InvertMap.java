package map_interface;

import java.util.*;

public class InvertMap {
	
	public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
	    Map<V, List<K>> result = new HashMap<>();
	    for (Map.Entry<K, V> entry : map.entrySet()) {
	        K key = entry.getKey();
	        V value = entry.getValue();
	        if (!result.containsKey(value)) {
	            result.put(value, new ArrayList<K>());
	        }
	        result.get(value).add(key);
	    }
	    return result;
	}

	 
    public static void main(String[] args) {
        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);

        Map<Integer, List<String>> inverted = invertMap(original);

        System.out.println(inverted);
    }

   
}
