import java.util.*;
public class calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble(), number2 = sc.nextDouble();
		double sum = number1+number2;
		double difference = number2-number1;
		double multiplication = number1*number2;
		double division = number2/number1;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +number1+" and "+number2+" is "+sum+", " +difference+", " +multiplication+", and " +division );
		
		
	}

}