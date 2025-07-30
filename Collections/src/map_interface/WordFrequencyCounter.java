package map_interface;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordCount = new HashMap<>();

        System.out.println("Enter text:");
        String line = sc.nextLine();

        // Remove punctuation and convert to lower case
        line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();//^ - negate, a-z, A-Z, 0-9, \\s -> whitespaces

        // Split line into words based on whitespace
        String[] words = line.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
