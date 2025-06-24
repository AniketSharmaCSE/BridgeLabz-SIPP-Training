package level1;

import java.util.Scanner;

public class EmployeeDetailsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        EmployeeDetails emp = new EmployeeDetails(name, id, salary);
        emp.displayDetails();
    }
}

