package level1;

public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("John Doe", "Deluxe", 3);
        HotelBooking copyBooking = new HotelBooking(customBooking);

        defaultBooking.display();
        customBooking.display();
        copyBooking.display();
    }
}
