package objectmodeling;

public class HospitalSystem {

    public class Patient {
        String name;

        public Patient(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Doctor {
        String name;
        Patient patient1;
        Patient patient2;

        public Doctor(String name) {
            this.name = name;
        }

        public void consult(Patient patient) {
            if (patient1 == null) {
                patient1 = patient;
            } else if (patient2 == null) {
                patient2 = patient;
            }
            System.out.println("Dr. " + name + " consulted " + patient.getName());
        }
    }

    public class Hospital {
        String name;
        Doctor doctor1;
        Doctor doctor2;
        Patient patient1;
        Patient patient2;

        public Hospital(String name) {
            this.name = name;
        }

        public void addDoctor(Doctor d) {
            if (doctor1 == null) {
                doctor1 = d;
            } else if (doctor2 == null) {
                doctor2 = d;
            }
        }

        public void addPatient(Patient p) {
            if (patient1 == null) {
                patient1 = p;
            } else if (patient2 == null) {
                patient2 = p;
            }
        }
    }
}
