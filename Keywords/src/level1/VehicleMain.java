package level1;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aniket Sharma", "Bike", "MH12AB1234");
        Vehicle v2 = new Vehicle("Ravi Patel", "Car", "GJ01XY5678");

        //Using instanceof before displaying
        if (v1 instanceof Vehicle) {
            v1.showDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.showDetails();
        }

        //Update registration fee and display again
        System.out.println("\nAfter Updating Fee:");
        Vehicle.updateRegistrationFee(2000.00);
        v1.showDetails();
    }
}

