package InstanceAndMethods;

public class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increase count when a new product is created
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: rs. " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
