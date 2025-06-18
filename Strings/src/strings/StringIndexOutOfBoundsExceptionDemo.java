package strings;

import java.util.*;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void generateException(String text, int index) {
        System.out.println("Character: " + text.charAt(index));
    }

    public static void handleException(String text, int index) {
        try {
            System.out.println("Character: " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled string index out of bounds exception");
        } catch (RuntimeException e) {
            System.out.println("Handled runtime exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = sc.next();
        System.out.println("Enter a value");
        int index = sc.nextInt();
        handleException(text, index);
        generateException(text, index);
        
    }
}
