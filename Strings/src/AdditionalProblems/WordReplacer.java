package AdditionalProblems;

import java.util.Scanner;

public class WordReplacer {

    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.equals(target)) {
                result += replacement + " ";
            } else {
                result += word + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String word1 = sc.next();
        System.out.print("Replace with: ");
        String word2 = sc.next();

        String newSentence = replaceWord(sentence, word1, word2);
        System.out.println("Modified sentence: " + newSentence);
    }
}
