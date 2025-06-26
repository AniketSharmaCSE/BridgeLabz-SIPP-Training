package level1;

public class PatientMain {
    public static void main(String[] args) {
        Patient p1 = new Patient("Aniket Sharma", 28, "Fever", 501);
        Patient p2 = new Patient("Neha Verma", 35, "Migraine", 502);

        // Using instanceof before displaying details
        if (p1 instanceof Patient) {
            p1.showDetails();
        }

        if (p2 instanceof Patient) {
            p2.showDetails();
        }

        // Display total number of patients
        Patient.getTotalPatients();
    }
}

