package objectmodeling;
public class BankSystem {

    public class Bank {
        String name;

        public Bank(String name) {
            this.name = name;
        }

        public void openAccount(Customer customer) {
            System.out.println("Account opened for " + customer.name + " in " + name);
        }
    }

    public class Customer {
        String name;
        double balance;

        public Customer(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public void viewBalance() {
            System.out.println("Balance for " + name + ": Rs." + balance);
        }
    }
}
