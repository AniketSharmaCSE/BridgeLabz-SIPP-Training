import java.util.*;
public class totalPrice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double unitprice = sc.nextDouble(), quantity = sc.nextDouble();
		double totalPrice = unitprice*quantity;
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+ "and unit price is INR "+unitprice);
	}
}