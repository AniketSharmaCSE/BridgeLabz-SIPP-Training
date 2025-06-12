import java.util.*;
public class TriangleArea{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble(), base = sc.nextDouble();
		double areacm = 0.5*base*height;
		double heightinch = height/2.54, baseinch = base/2.54;
		double heightfeet = heightinch/12, basefeet = baseinch/12;
		double areainch = 0.5*baseinch*heightinch;
		double areafeet =0.5*basefeet*heightfeet;
		System.out.println("Your Area in cm is "+areacm+" while in feet is "+areafeet+" and inches is "+areainch);
		
		
	}

}