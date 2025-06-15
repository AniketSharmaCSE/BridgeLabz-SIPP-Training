import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number");
        }

        // Compute using while loop
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        // Compute using formula
        int formulaSum = n * (n + 1) / 2;
		
        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);

        if (sum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results are different from both methods");
        }
    }
}
	