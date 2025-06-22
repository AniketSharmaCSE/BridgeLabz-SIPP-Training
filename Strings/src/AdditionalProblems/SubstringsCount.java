package AdditionalProblems;
import java.util.Scanner;

public class SubstringsCount {

    public static int countSub(String main, String sub) {
        int count = 0;
        for (int i = 0; i <= main.length() - sub.length(); i++) {
            if (main.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String main = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        System.out.println("Occurrences: " + countSub(main, sub));
    }
}

