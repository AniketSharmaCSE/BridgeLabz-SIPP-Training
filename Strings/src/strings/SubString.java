package strings;

import java.util.Scanner;

public class SubString {
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = sc.next();
        System.out.println("Enter starting index: ");
        int start = sc.nextInt();
        System.out.println("Enter end index: ");
        int end = sc.nextInt();
        String manualSub = manualSubstring(text, start, end);
        String builtInSub = text.substring(start, end);
        boolean areEqual = compareStrings(manualSub, builtInSub);
        System.out.println("Manually made substring: ");
        System.out.println(manualSub);
        System.out.println("Substring made using built-in function: ");
        System.out.println(builtInSub);
        System.out.println("Are both substring same?");
        if(areEqual) {System.out.println("Yes");}
    }
}
