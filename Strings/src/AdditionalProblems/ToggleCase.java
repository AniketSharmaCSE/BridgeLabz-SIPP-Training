package AdditionalProblems;
import java.util.Scanner;

public class ToggleCase {

    public static String toggle(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                result += Character.toUpperCase(c);
            else
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        System.out.println("Toggled: " + toggle(input));
    }
}
