package level2;

import java.util.Scanner;

public class CartItemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a CartItem object
        CartItem item = new CartItem();

        // Take input to add an item to the cart
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        // Add the item to the cart
        item.addItem(name, price, qty);

        // Display the total cost
        item.displayTotalCost();

        // Ask if the user wants to remove the item
        System.out.print("Do you want to remove the item? (yes/no): ");
        sc.nextLine(); // consume leftover newline
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            item.removeItem();
            System.out.println("Item removed from cart.");
        }
    }
}
