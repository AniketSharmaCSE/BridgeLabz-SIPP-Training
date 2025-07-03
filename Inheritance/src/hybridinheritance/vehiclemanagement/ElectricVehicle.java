package hybridinheritance.vehiclemanagement;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging electric vehicle: " + model);
    }
}
