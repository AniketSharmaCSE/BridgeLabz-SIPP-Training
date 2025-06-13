import java.util.*;
public class sumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		System.out.println("Enter a number to add or 0 to exit");
		double inputVal = sc.nextDouble();
		while(inputVal != 0) {
			total += inputVal;
			System.out.println("Enter a number to add or 0 to get the total");
			inputVal = sc.nextDouble();
		}
		System.out.println(total);
	}
}