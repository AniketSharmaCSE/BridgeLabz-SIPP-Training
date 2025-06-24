package level1;
//MobilePhone class for attributes
public class MobilePhone {
String brand;
String model;
double price;

//Constructor to initialize attributes

MobilePhone(String brand, String model, double price){
	this.brand = brand;
	this.model = model; 
	this.price = price;
}

//Method to display information
void display() {
	 System.out.println("brand: " + brand);
     System.out.println("model: " + model);
     System.out.println("Price: Rs." + price);
}

}
