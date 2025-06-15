import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a positive integer");
        }

        int factorial = 1;
        int i = 1;

        // Compute factorial using while loop
        while (i <= n) {
            factorial *= i;
            i++;
        }


        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
