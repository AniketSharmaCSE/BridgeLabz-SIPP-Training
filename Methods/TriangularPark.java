import java.util.*;

public class TriangularPark{
	public static double rounds(double side1, double side2, double side3){
		double perimeter = side1+side2+side3;
		double distance = 5.0;
		double numberofRounds = distance/perimeter;
		return numberofRounds;
	}
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of side 1 of the triangle");
		double side1 = sc.nextDouble();
		System.out.println("Enter length of side 2 of the triangle");
		double side2 = sc.nextDouble();
		System.out.println("Enter length of side 3 of the triangle");
		double side3 = sc.nextDouble();
		
		System.out.println("Number of rounds = "+rounds(side1,side2,side3));
	}

}