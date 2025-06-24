package level2;


import java.util.Scanner;

public class PalindromeCheckerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for a word 
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = sc.next();

        // Create checker object and display result
        PalindromeChecker checker = new PalindromeChecker(input);
        checker.showResult();
    }
}
