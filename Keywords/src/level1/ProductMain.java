package level1;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Bluetooth Speaker", 2490, 2);
        Product p2 = new Product(102, "Smart Watch", 4999, 1);

        //Use instanceof before displaying
        if (p1 instanceof Product) {
            p1.showDetails();
        }
    }
}
