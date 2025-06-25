package InstanceAndMethods;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Yash", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(600);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
