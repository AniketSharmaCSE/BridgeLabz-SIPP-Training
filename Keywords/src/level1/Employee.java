package level1;

public class Employee {
    //Static variable shared across all employees
    static String companyName = "TechCorp";

    //Final variable for employee ID
    final int id;

    //Instance variables
    String name;
    String designation;

    //Static counter to track total number of employees
    static int totalEmployees = 0;

    //Constructor using this. keyword
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    //Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    //Method to display employee details
    public void showDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
}
