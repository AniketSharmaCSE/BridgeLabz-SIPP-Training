package hybridinheritance.vehiclemanagement;
public class Main {
    public static void main(String[] args) {
        PetrolVehicle petrol = new PetrolVehicle(180, "Swift");
        ElectricVehicle electric = new ElectricVehicle(150, "Tesla Model 3");

        petrol.refuel();
        electric.charge();
    }
}

