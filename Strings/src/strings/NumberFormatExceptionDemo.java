package strings;
import java.util.*;

public class NumberFormatExceptionDemo {

	public static void generateException(String text) {
		int number = Integer.parseInt(text);
		System.out.println("Converted number: "+ number);
	}
	public static void handleException(String text) {
		try {
			int number = Integer.parseInt(text);
			System.out.println("Converted number: "+ number);
		}
		catch(NumberFormatException e) {
			System.out.println("Handled number format exception");
		}
		catch(RuntimeException e) {
			System.out.println("Handled Runtime exception");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = sc.next();
		try {
		    generateException(text);
		} catch (NumberFormatException e) {
		    System.out.println("Caught in main: " + e.getMessage());
		}
		handleException(text);

}
}
