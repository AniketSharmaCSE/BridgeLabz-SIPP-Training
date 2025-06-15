import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
		//check if integer is positive or not
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
			//calculate factorial
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}
