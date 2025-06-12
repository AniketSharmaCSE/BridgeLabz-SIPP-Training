import java.util.*;
public class DiscountedFee2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt(), discountPercent = sc.nextInt();
		double discountedAmount = (fee*discountPercent)/100;
		double feeToPay = fee - discountedAmount;
		System.out.println("The discount amount is INR "+discountedAmount+ " and final discounted fee is INR "+feeToPay );
		
		
	}

}