package setinterface;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> symDiff = getSymmetricDifference(set1, set2);

        System.out.println("Symmetric Difference: " + symDiff);
    }

    public static <T> Set<T> getSymmetricDifference(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        Set<T> temp = new HashSet<>(s2);

        // Remove all common elements from result (intersection)
        result.removeAll(s2);
        // Remove all elements of s1 from temp, so temp contains elements only in s2 but not in s1
        temp.removeAll(s1);

        // Union of unique elements from s1 and s2
        result.addAll(temp);

        return result;
    }
}

