import java.util.*;
public class handshakes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("Total number of possible handshakes for "+numberOfStudents+" is "+handshakes );
	}
}