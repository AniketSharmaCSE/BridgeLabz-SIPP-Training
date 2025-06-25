package level1;

//Item class to track item details and calculate total cost
class TrackInventory {
 int itemCode;
 String itemName;
 double price;

 // Constructor to initialize item attributes
 TrackInventory(int code, String name, double price) {
     this.itemCode = code;
     this.itemName = name;
     this.price = price;
 }

 // Method to display item details
 void displayDetails() {
     System.out.println("Item Code: " + itemCode);
     System.out.println("Item Name: " + itemName);
     System.out.println("Price per unit: ₹" + price);
 }

 // Method to calculate total cost for given quantity
 double calculateTotalCost(int quantity) {
     return price * quantity;
 }
}