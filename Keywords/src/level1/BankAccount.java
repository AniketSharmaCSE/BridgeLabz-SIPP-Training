package level1;

public class BankAccount {
    //Static variable shared by all accounts
    static String bankName = "State Bank";

    //Final variable, cannot be changed once assigned
    final int accountNumber;

    //Instance variable
    String accountHolderName;

    //Static counter to track total accounts
    static int totalAccounts = 0;

    //Constructor using this. to resolve variable shadowing
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to return total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Method to display account details
    public void showDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}
