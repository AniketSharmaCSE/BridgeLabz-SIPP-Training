package level2;

// Class that holds details of a movie ticket
public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Method to book a ticket by setting all attributes
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket information
    public void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}
