package level1;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aniket", 1001);
        BankAccount acc2 = new BankAccount("Ravi", 1002);

        // Check using instanceof
        if (acc1 instanceof BankAccount) {
            acc1.showDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.showDetails();
        }

        // Call static method
        BankAccount.getTotalAccounts();
    }
}
