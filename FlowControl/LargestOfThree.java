import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Find the largest value
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
		
        System.out.println("Is the first number the largest? " + (number1 == max));
        System.out.println("Is the second number the largest? " + (number2 == max));
        System.out.println("Is the third number the largest? " + (number3 == max));
    }
}
