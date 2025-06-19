package strings;

import java.util.Scanner;

public class WordsAndLengths {

    public static String[] splitWords(String str) {
        str = str.trim() + " ";
        String word = "";
        String[] temp = new String[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                word += str.charAt(i);
            else if (!word.equals("")) {
                temp[count++] = word;
                word = "";
            }
        }
        String[] words = new String[count];
        System.arraycopy(temp, 0, words, 0, count);
        return words;
    }

    public static int getLength(String word) {
        int len = 0;
        while (true) {
            if (len >= word.toCharArray().length) break;
            len++;
        }
        return len;
    }

    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] table = getWordLengthTable(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i][0] + "\t");
            int len = 0;
            int j = 0;
            while (j < table[i][1].toCharArray().length) {
                len = len * 10 + (table[i][1].charAt(j) - '0');
                j++;
            }
            System.out.println(len);
        }
    }
}
