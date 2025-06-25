package level1;

import java.util.Scanner;

// Main method to test
class ProductMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Make 2 products
		System.out.print("Enter first product name: ");
		String name1 = sc.nextLine();
		System.out.print("Enter first product price: ");
		double price1 = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter second product name: ");
		String name2 = sc.nextLine();
		System.out.print("Enter second product price: ");
		double price2 = sc.nextDouble();

		Product p1 = new Product(name1, price1);
		Product p2 = new Product(name2, price2);

		// Show their details
		System.out.println("Product 1 Details: ");
		p1.displayProductDetails();

		System.out.println("Product 2 Details: ");
		p2.displayProductDetails();

		// Show total product count
		System.out.println("Total Products Created: ");
		Product.displayTotalProducts();
	}
}