import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] empData = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary.");
                i--;
                continue;
            }

            System.out.println("Enter years of service: ");
            double years = sc.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service.");
                i--;
                continue;
            }

            empData[i][0] = salary;
            empData[i][1] = years;
        }

        for (int i = 0; i < 10; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];

            if (years > 5) {
                bonus[i] = 0.05 * salary;
            } else {
                bonus[i] = 0.02 * salary;
            }

            newSalary[i] = salary + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }

        System.out.println("Bonus Report: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary: " + empData[i][0]);
            System.out.println("Years of Service: " + empData[i][1]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
