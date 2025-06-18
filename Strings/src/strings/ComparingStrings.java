package strings;
import java.util.*;
public class ComparingStrings {
	
	public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String string1 = sc.next(); 
		System.out.println("Enter the second string: ");
		String string2 = sc.next();
		if(compareStrings(string1, string2)) {
			System.out.println("Manual comparison result : given strings are same");
		}
		else {System.out.println("Manual comparison result : given strings are not same");}
		if(string1.equals(string2)) { 
			System.out.println("In-Built method comparison result : given strings are same");
		}
		else {System.out.println("In-Built comparison result : given strings are not same");}
	}

}
