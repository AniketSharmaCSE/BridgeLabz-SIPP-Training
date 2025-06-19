package strings;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {
        String result = text.substring(5, 2); // start > end
        System.out.println("Substring: " + result);
    }

    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2); // start > end
            System.out.println("Substring: " + result);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Start index greater than end index.");
        } 
        catch (RuntimeException e) {
        	System.out.println("RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        handleException(input);
        generateException(input);
        
    }
}


