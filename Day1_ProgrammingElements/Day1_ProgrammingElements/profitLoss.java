public class profitLoss{
	public static void main(String[] args){
		int CostPrice = 129,  sellingPrice = 191;
		int profit = sellingPrice-CostPrice;
		double profitPercent = ((double)profit/CostPrice)*100;
		System.out.println("The cost price is INR "+ CostPrice + "and selling price is INR"+sellingPrice);
		System.out.print("The Profit is INR  "+profit+ " and the Profit Percentage is "+profitPercent);
		
	}

}