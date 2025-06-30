

package objectmodeling;

public class EcommercePlatform {

    public class Product {
        String name;

        public Product(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Customer {
        String name;

        public Customer(String name) {
            this.name = name;
        }

        public void placeOrder(Order order) {
            System.out.println(name + " placed an order.");
            order.showOrder();
        }
    }

    public class Order {
        Product p1;
        Product p2;

        public Order(Product p1, Product p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public void showOrder() {
            System.out.println("Order contains:");
            if (p1 != null) System.out.println(" - " + p1.getName());
            if (p2 != null) System.out.println(" - " + p2.getName());
        }
    }
}
