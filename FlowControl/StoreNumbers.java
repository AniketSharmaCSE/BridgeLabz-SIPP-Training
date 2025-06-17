import java.util.*;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;                 
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = sc.nextDouble();
            if (input <= 0) {
                break;  // Stop if 0 or negative
            }
            if (index == 10) {
                break;  // Stop if array is full
            }
            numbers[index] = input;  // Store value in array
            index++;                 // Increment index
        }
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];  // Add each value to total
        }
        System.out.println("\nThe total sum of numbers is: " + total);
    }
}
