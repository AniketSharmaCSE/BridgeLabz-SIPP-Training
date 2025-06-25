package level1;

import java.util.Scanner;

public class Product {
	// Instance variables - each product has its own name and price
	String productName;
	double price;

	// Class variable - shared by all Product objects
	static int totalProducts = 0;

	// Constructor to initialize a product and increase total count
	Product(String name, double price) {
		this.productName = name;
		this.price = price;
		totalProducts++; // every time a product is made, count increases
	}

	// Instance method - shows details of a single product
	void displayProductDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Price: Rs. " + price);
	}

	// Class method - shows total number of products
	static void displayTotalProducts() {
		System.out.println("Total Products: " + totalProducts);
	}

}
