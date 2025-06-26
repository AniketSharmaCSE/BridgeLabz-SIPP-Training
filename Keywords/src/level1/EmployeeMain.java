package level1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aniket", 101, "Developer");
        Employee emp2 = new Employee("Riya", 102, "Tester");

        //Use instanceof before showing details
        if (emp1 instanceof Employee) {
            emp1.showDetails();
        }

        if (emp2 instanceof Employee) {
            emp2.showDetails();
        }

        //Call static method
        Employee.displayTotalEmployees();
    }
}

