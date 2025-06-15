import java.util.Scanner;

public class SumUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
	
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
        }
		//Sum using for Loop
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop = sumLoop + i;
        }

        // Sum using formula
        int sumFormula = n*(n+1)/2;
		
        System.out.println("Sum using for loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);

        // Comparison
        if (sumLoop == sumFormula) {
            System.out.println("Both methods give the same result.");
        } 
		else {
            System.out.println("Results do not match.");
        }
    }
}
