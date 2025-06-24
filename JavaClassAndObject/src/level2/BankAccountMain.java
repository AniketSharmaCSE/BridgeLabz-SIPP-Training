package level2;
import java.util.Scanner;

//Main method to run program
public class BankAccountMain {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//Taking user input for name, number and initial balance
			System.out.print("Enter account holder name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter account number: ");
	        String accountNumber = sc.nextLine();

	        System.out.print("Enter initial balance: ");
	        double balance = sc.nextDouble();
			BankAccount Account = new BankAccount(name, accountNumber, balance);
			//calling methods
			Account.Deposit(1000);
	        Account.withdraw(500);
	        Account.display();
		}
}
