import java.util.Scanner;

public class CountdownUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input countdown start number
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
