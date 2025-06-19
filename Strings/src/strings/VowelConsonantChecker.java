package strings;
import java.util.Scanner;

public class VowelConsonantChecker {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c += 32; // Convert to lowercase
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) >= 0) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Char    Type");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch + "    " + checkCharType(ch));
        }
    }
}
