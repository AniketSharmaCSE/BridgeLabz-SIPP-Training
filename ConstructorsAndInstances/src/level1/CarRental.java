package level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental() {
        customerName = "Unknown";
        carModel = "Basic";
        rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays);
        System.out.println("Total Cost: rs. " + calculateCost());
    }

    public double calculateCost() {
        int ratePerDay = 50; // example rate
        return rentalDays * ratePerDay;
    }
}
