package level1;

public class Product {
    //Static variable shared by all products
    static double discount = 5.0;

    //Final variable (unique, cannot be changed)
    final int productID;

    //Instance variables
    String productName;
    double price;
    int quantity;

    //Constructor using this. to resolve ambiguity
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    //Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    //Method to show product details
    public void showDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Current Discount: " + discount + "%");
    }
}
