package strings;
import java.util.Scanner;

public class StringLength {
    
  
    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            //handle runtime exception
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();

        int manualLength = getLength(word); 
        int builtinLength = word.length();  

        System.out.println("Length using method: " + manualLength);
        System.out.println("Length using built-in: " + builtinLength);
    }
}
