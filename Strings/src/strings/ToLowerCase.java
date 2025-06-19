package strings;
import java.util.Scanner;

public class ToLowerCase {

    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); 
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = inp.nextLine();

        String builtInLower = text.toLowerCase();
        String customLower = convertToLower(text);
        boolean isSame = compareStrings(builtInLower, customLower);

        System.out.println("\nBuilt-in lowercase: " + builtInLower);
        System.out.println("Custom lowercase   : " + customLower);
        System.out.println("Strings Match?     : " + isSame);
    }
}
