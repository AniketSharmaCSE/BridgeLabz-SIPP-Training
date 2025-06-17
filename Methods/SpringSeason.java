import java.util.*;
public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        if(month>=3 && month <= 6){
			if(day >=20 && day<=31){
				return true;
			}
			else{return false;}
		}
		else{return false;}
	}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month = sc.nextInt();
		System.out.println("Enter the day: ");
		int day = sc.nextInt();
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
