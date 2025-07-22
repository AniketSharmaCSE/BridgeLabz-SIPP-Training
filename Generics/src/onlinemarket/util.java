package onlinemarket;

public class util {
    public static <T> void applyDiscount(Product<T> product, double percent) {
        double discount = product.getPrice() * percent / 100.0;
        product.setPrice(product.getPrice() - discount);
    }
}
