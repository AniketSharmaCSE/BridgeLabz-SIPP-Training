public class DiscountedFee{
	public static void main(String[] args){
		int fee = 125000, discountPercent = 10;
		double discountedAmount = (fee*10)/100;
		double feeToPay = fee - discountedAmount;
		System.out.println("The discount amount is INR "+discountedAmount+ " and final discounted fee is INR "+feeToPay );
		
		
	}

}