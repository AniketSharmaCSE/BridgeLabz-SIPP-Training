import java.util.*;
public class intOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int operation1 = a+b*c; //multiplication has higher precedence than addition, b*c is solved first
		int operation2 = a*b+c;//multiplication has higher precedence than addition, a*b is solved first
		int operation3 = a%b+c;//modulo has higher precedence than addition, a%b is solved first
		
		System.out.println("The results of Int Operations are "+operation1+", "+operation2+", "+"and "+operation3);
	}
}