package AssistedProblems;

public class EmployeeManagementSystemMain {
    public static void main(String[] args) {
        Manager m = new Manager("Ravi", 101, 90000, 5);
        Developer d = new Developer("Anjali", 102, 75000, "Java");
        Intern i = new Intern("Rahul", 103, 15000, "Associate Developer");

        System.out.println("--- Manager Details ---");
        m.displayDetails();

        System.out.println("\n--- Developer Details ---");
        d.displayDetails();

        System.out.println("\n--- Intern Details ---");
        i.displayDetails();
    }
}
