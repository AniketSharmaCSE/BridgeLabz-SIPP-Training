package hybridinheritance.restrauntmanagement;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi", 101);
        Waiter waiter = new Waiter("Ankit", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
