package strings;
import java.util.*;

public class StringToCharacter {

    public static char[] manualCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.next();
        char[] manual = manualCharArray(text);
        char[] builtin = text.toCharArray();
        printArray(manual);
        printArray(builtin);
        if (compareArrays(manual, builtin)) {
            System.out.println("Both arrays are same");
        } else {
            System.out.println("Arrays are different");
        }
    }
}
