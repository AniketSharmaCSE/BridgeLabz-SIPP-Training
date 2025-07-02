package multilevelinheritance.retailordermanagement;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("O101", "2025-07-01");
        ShippedOrder shipped = new ShippedOrder("O102", "2025-07-01", "TR123");
        DeliveredOrder delivered = new DeliveredOrder("O103", "2025-07-01", "TR456", "2025-07-02");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
