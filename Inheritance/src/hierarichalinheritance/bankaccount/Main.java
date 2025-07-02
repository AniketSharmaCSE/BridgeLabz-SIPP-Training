package hierarichalinheritance.bankaccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA101", 10000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA202", 5000, 5);
        FixedDepositAccount fixed = new FixedDepositAccount("FD303", 20000, 12);

        savings.displayAccountType();
        checking.displayAccountType();
        fixed.displayAccountType();
    }
}

