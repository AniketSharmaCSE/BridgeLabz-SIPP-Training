package level2;

import java.util.Scanner;

public class MovieTicketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for booking the ticket
        System.out.print("Enter Movie Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ₹");
        double price = sc.nextDouble();

        // Create ticket object
        MovieTicket ticket = new MovieTicket();

        // Book the ticket using the method (assigns seat and updates price)
        ticket.bookTicket(name, seat, price);

        // Display the ticket details
        System.out.println("Ticket Details: ");
        ticket.displayTicket();
    }
}
