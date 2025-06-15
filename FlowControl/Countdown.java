import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take countdown start number
        System.out.print("Enter the starting number: ");
        int counter = sc.nextInt();
       
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
