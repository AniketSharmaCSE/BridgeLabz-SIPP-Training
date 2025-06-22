package AdditionalProblems;
import java.util.Scanner;

public class FindLongestWord {
    public static String longest(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = sc.nextLine();
        System.out.println("Longest word: " + longest(input));
    }
}
