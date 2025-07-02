package hierarichalinheritance.bankaccount;

public class FixedDepositAccount extends BankAccount {
    int depositPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account");
    }
}
