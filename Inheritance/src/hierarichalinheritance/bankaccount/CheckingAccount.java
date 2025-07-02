package hierarichalinheritance.bankaccount;

public class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account");
    }
}
