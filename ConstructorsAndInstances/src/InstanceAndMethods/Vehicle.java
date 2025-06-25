package InstanceAndMethods;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: rs. " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: rs. " + registrationFee);
    }
}

