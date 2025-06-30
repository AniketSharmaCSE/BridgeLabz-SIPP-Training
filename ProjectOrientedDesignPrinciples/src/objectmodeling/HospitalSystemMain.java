package objectmodeling;

public class HospitalSystemMain {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();

        HospitalSystem.Hospital hospital = system.new Hospital("Apollo");

        HospitalSystem.Doctor d1 = system.new Doctor("Sharma");
        HospitalSystem.Doctor d2 = system.new Doctor("Khan");

        HospitalSystem.Patient p1 = system.new Patient("Aarav");
        HospitalSystem.Patient p2 = system.new Patient("Isha");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);
    }
}
