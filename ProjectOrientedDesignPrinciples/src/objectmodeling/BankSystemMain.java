package objectmodeling;

public class BankSystemMain {
    public static void main(String[] args) {
        BankSystem system = new BankSystem();

        BankSystem.Bank bank = system.new Bank("State Bank");
        BankSystem.Customer customer = system.new Customer("Aniket", 5000.00);

        bank.openAccount(customer);
        customer.viewBalance();
    }
}
