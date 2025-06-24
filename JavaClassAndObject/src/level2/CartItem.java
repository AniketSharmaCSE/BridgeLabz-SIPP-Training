package level2;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to remove an item from the cart (sets values to default)
    public void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
    }

    // Method to display total cost (price * quantity)
    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: ₹" + total);
    }
}
