import java.util.*;
public class Height{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double centimeteres = sc.nextDouble();
		double inches = centimeteres/2.54;
		double feet = inches/12;
		System.out.println("Your Height in cm is "+centimeteres+ " while in feet is "+feet+" and inches is "+inches );
		
		
	}

}