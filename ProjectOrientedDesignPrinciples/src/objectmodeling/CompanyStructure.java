package objectmodeling;

import java.util.*;

public class CompanyStructure {

    public class Company {
        String name;
        ArrayList<Department> departments;

        public Company(String name) {
            this.name = name;
            departments = new ArrayList<>();
        }

        public void addDepartment(String deptName) {
            departments.add(new Department(deptName));
        }

        public void showStructure() {
            System.out.println("Company: " + name);
            for (Department dept : departments) {
                dept.showEmployees();
            }
        }

        // Inner Department class 
        public class Department {
            String deptName;
            ArrayList<Employee> employees;

            public Department(String deptName) {
                this.deptName = deptName;
                employees = new ArrayList<>();
                // For simplicity, adding dummy employees
                employees.add(new Employee("Aniket"));
                employees.add(new Employee("Neha"));
            }

            public void showEmployees() {
                System.out.println(" Department: " + deptName);
                for (Employee emp : employees) {
                    emp.display();
                }
            }

            // Employee exists only inside Department
            public class Employee {
                String name;

                public Employee(String name) {
                    this.name = name;
                }

                public void display() {
                    System.out.println("  Employee: " + name);
                }
            }
        }
    }
}
