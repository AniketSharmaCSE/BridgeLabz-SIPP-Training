import java.util.*;

public class SimpleIntrest{
	public static int SimpleInterest(int principle, int rate , int time){
		return (principle*rate*time)/100;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount: ");
		int principle = sc.nextInt();
		System.out.println("Enter the rate: ");
		int rate = sc.nextInt();
		System.out.println("Enter the time: ");
		int time = sc.nextInt();
		System.out.println("The Simple Interest is "+SimpleInterest(principle, rate, time)+" for Principal "+principle+", Rate of Interest "+rate + " and Time "+time);
	}

}
