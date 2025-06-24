package level2;

public class PalindromeChecker {
    String text;

    // Constructor to store the input string
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the word is a palindrome
    public boolean isPalindrome() {
        String lowerText = text.toLowerCase();  // convert to lowercase for case-insensitive check
        int left = 0;
        int right = lowerText.length() - 1;

        // Check characters from both ends of the string
        while (left < right) {
            if (lowerText.charAt(left) != lowerText.charAt(right)) {
                return false; // if characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // all characters matched, it's a palindrome
    }

    // Method to print the result nicely
    public void showResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
