import java.util.*;

public class CategorizeNumbers{
	public static int Category(int number){
		if(number<0){
			return -1;
		}
		else if(number>0){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int result = Category(number);
		
		if(result == 1){
			System.out.println("Positive Number");
		}
		
		else if(result == -1){
			System.out.println("Negative Number");
		}
		else{
			
			System.out.println("It's a Zero!");
		}
	}
	

}