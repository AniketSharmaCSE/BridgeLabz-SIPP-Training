import java.util.*;
public class quotientAndRemainder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble(), number2 = sc.nextDouble();
		double remainder = number2%number1;
		double quotient = number2/number1;
		System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+number1+" and "+number2);
	}
}