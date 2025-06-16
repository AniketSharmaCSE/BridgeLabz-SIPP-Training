import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Reversed number: 0");
        }

        int[] digits = new int[10];
        int index = 0;

        while (number > 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        System.out.print("Digits in reverse order: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }

        System.out.println();
    }
}
