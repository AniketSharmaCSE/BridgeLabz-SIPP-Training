import java.util.*;
public class doubleOpt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		double operation1 = a+b*c; //multiplication has higher precedence than addition, b*c is solved first
		double operation2 = a*b+c;//multiplication has higher precedence than addition, a*b is solved first
		double operation3 = a%b+c;//modulo has higher precedence than addition, a%b is solved first
		
		System.out.println("The results of Int Operations are "+operation1+", "+operation2+", "+"and "+operation3);
	}
}