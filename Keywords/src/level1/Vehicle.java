package level1;

public class Vehicle {
    //Static variable shared across all vehicles
    static double registrationFee = 1500.00;

    //Final variable for unique registration number
    final String registrationNumber;

    //Instance variables
    String ownerName;
    String vehicleType;

    //Constructor using this. to resolve ambiguity
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    //Method to display registration details
    public void showDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }
}
