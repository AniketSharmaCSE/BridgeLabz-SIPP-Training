package AdditionalProblems;

import java.util.Scanner;

public class MostFrequentChar {

    public static char mostFrequent(String str) {
        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = current;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char result = mostFrequent(input);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
