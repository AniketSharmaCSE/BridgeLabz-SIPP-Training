package hybridinheritance.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Refueling petrol vehicle: " + model);
    }
}
