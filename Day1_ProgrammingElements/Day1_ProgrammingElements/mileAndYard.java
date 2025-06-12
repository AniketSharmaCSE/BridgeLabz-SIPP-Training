import java.util.*;
public class mileAndYard{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double feet = sc.nextDouble();
		double yard = feet/3;
		double miles = yard/1760;
		
		
		System.out.println("Your Height in feet is "+feet+" while in yard is "+yard+" and miles is "+miles);
	}
}