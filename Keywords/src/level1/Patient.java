package level1;

public class Patient {
    //Static variable shared by all patients
    static String hospitalName = "CityCare Hospital";

    //Final variable for unique ID
    final int patientID;

    //Instance variables
    String name;
    int age;
    String ailment;

    //Static counter to keep track of total patients
    static int totalPatients = 0;

    //Constructor using this. keyword
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    //Static method to display total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    //Method to show patient details
    public void showDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}
