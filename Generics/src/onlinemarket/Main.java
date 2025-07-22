package onlinemarket;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();

        catalog.add(new Product<>("Harry Potter", 400, new BookCategory("Fiction")));
        catalog.add(new Product<>("Jeans", 900, new ClothingCategory("Trousers")));
        catalog.add(new Product<>("Mouse", 1200, new GadgetCategory("Computer")));

        for (Product<?> product : catalog) {
            applyDiscount(product, 10);
        }

        for (Product<?> product : catalog) {
            System.out.println(product);
        }
    }

    public static <T> void applyDiscount(Product<T> product, double percent) {
        double discount = product.getPrice() * percent / 100.0;
        product.setPrice(product.getPrice() - discount);
    }
}
