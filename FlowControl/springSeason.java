import java.util.Scanner;

public class springSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter month (1 to 12): ");
        int month = sc.nextInt();
        System.out.println("Enter day (1 to 31): ");
        int day = sc.nextInt();
		
		if(month>=3 && month <= 6){
			if(day >=20 && day<=31){
				System.out.println("Its a Spring season");
			}
			else{System.out.println("Not a spring season");}
		}
		else{System.out.println("Not a spring season");}
	}
}