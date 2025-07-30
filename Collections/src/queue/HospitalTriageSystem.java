package queue;

import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity;  // Higher number = higher severity

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        // Descending order by severity
        return other.severity - this.severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>();

        patientQueue.add(new Patient("John", 3));
        patientQueue.add(new Patient("Alice", 5));
        patientQueue.add(new Patient("Bob", 2));

        System.out.println("Patients will be treated in this order:");
        while (!patientQueue.isEmpty()) {
            Patient p = patientQueue.poll();  // retrieves and removes the head 
            System.out.println(p.name);
        }
    }
}
