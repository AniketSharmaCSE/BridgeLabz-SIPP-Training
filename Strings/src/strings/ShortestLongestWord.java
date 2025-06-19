package strings;
import java.util.Scanner;

public class ShortestLongestWord {

    //method to split text into words using charAt()
    public static String[] splitWords(String str) {
        str = str.trim() + " ";
        String word = "";
        String[] temp = new String[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else if (!word.equals("")) {
                temp[count++] = word;
                word = "";
            }
        }

        String[] words = new String[count];
        System.arraycopy(temp, 0, words, 0, count);
        return words;
    }

    //Method to find length of a string without using length()
    public static int getLength(String word) {
        int len = 0;
        while (true) {
            if (len >= word.toCharArray().length) break;
            len++;
        }
        return len;
    }

    //Method to return 2D array of word and its length
    public static String[][] getWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    //Find shortest and longest word from the 2D array
    public static String[] findMinMaxWord(String[][] wordData) {
        String shortest = wordData[0][0];
        String longest = wordData[0][0];
        int minLen = getLength(shortest);
        int maxLen = minLen;

        for (int i = 1; i < wordData.length; i++) {
            int len = getLength(wordData[i][0]);
            if (len < minLen) {
                minLen = len;
                shortest = wordData[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = wordData[i][0];
            }
        }
        return new String[] {shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = splitWords(sentence);
        String[][] wordData = getWordLengthTable(words);
        String[] minMaxWords = findMinMaxWord(wordData);

        System.out.println("\nWord\tLength");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest word: " + minMaxWords[0]);
        System.out.println("Longest word: " + minMaxWords[1]);
    }
}
