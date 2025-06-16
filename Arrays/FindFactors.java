import java.util.*;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];  // Initial size 10
        int index = 0;

        // Step 2: Find and store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if needed
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;  // Double the size
                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];  // Copy existing factors
                    }

                    factors = temp;  // Assign resized array back
                }

                factors[index] = i;  // Store the factor
                index++;
            }
        }

        // Step 3: Display results
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
