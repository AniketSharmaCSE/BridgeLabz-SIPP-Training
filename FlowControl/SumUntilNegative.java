import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;

        while (true) {
            System.out.print("Enter a natural number or 0 or negative to stop: ");
            int n = sc.nextInt();

            if (n <= 0) {
                break;
            }
            int sum = n*(n+1)/2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);

            totalSum += sum;
        }

        System.out.println("Total accumulated sum: " + totalSum);
    }
}
