package level2;

public class BankAccount {
	String accountHolder;
	String accountNumber;
	double balance;
	//Constructor to initialize objects
	BankAccount(String name, String accountNumber, double balance){
		this.accountHolder = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//Method to deposit money
	void Deposit(int amount) {
		balance+= amount;
		System.out.println("Deposited Rs. "+amount+" Succesfully. Balance: "+balance);
	}
	//Method to withdraw money
	void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("Not enough balance. Current Balance: "+balance);
		}
		else {
			balance-=amount;
			System.out.println("Withdrawn Rs. "+amount+" Succesfully. Balance: "+balance);
		}
	}
	//Method to show balance
	void display() {
		System.out.println("Current Balance: "+balance);
	}
}
