package level1;
public class TrackInventoryMain{
public static void main(String[] args) {
	TrackInventory item = new TrackInventory(101, "Pen", 12.5); // create item
    item.displayDetails();
    int quantity = 10;
    System.out.println("Total Cost for " + quantity + " items: ₹" + item.calculateTotalCost(quantity));
}
}