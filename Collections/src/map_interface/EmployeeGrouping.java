package map_interface;

import java.util.*;

class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    // Override equals and hashCode so Department can be used as Map key properly
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) {
        	return false;
        }
        Department d = (Department) o;
        return name != null ? name.equals(d.name) : d.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class EmployeeGrouping {
    public static void main(String[] args) {
        Department hr = new Department("HR");
        Department it = new Department("IT");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", hr));
        employees.add(new Employee("Bob", it));
        employees.add(new Employee("Carol", hr));

        Map<Department, List<Employee>> grouped = groupByDepartment(employees);

        // Print the grouped map
        for (Map.Entry<Department, List<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<Department, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {
            Department dept = emp.department;

            if (!map.containsKey(dept)) {
                map.put(dept, new ArrayList<Employee>());
            }

            map.get(dept).add(emp);
        }

        return map;
    }
}
