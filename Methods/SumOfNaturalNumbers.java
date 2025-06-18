package bridgelabs;
import java.util.*;
public class SumOfNaturalNumbers {
	public static int sum(int n) {
		int total = 0;
		for(int i = 1; i<=n; i++) {
			total += i;
		}
		return total;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int n = sc.nextInt();
		System.out.print("Sum of natural numbers upto "+n+" is : "+sum(n));
	}

}
