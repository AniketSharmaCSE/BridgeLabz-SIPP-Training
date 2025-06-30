package objectmodeling;

public class EcommercePlatformMain {
    public static void main(String[] args) {
        EcommercePlatform platform = new EcommercePlatform();

        EcommercePlatform.Product prod1 = platform.new Product("Phone");
        EcommercePlatform.Product prod2 = platform.new Product("Headphones");

        EcommercePlatform.Order order = platform.new Order(prod1, prod2);

        EcommercePlatform.Customer customer = platform.new Customer("Aniket");

        customer.placeOrder(order);
    }
}
