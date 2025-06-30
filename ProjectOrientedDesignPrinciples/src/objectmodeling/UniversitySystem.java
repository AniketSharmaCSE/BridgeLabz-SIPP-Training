package objectmodeling;

import java.util.*;

public class UniversitySystem {

    public class University {
        String name;
        ArrayList<Department> departments;
        ArrayList<Faculty> facultyList;

        public University(String name) {
            this.name = name;
            departments = new ArrayList<>();
            facultyList = new ArrayList<>();
        }

        public void addDepartment(String deptName) {
            departments.add(new Department(deptName));
        }

        public void addFaculty(Faculty f) {
            facultyList.add(f);
        }

        public void showUniversityStructure() {
            System.out.println("University: " + name);

            System.out.println(" Departments:");
            for (Department d : departments) {
                System.out.println("  - " + d.deptName);
            }

            System.out.println(" Faculties:");
            for (Faculty f : facultyList) {
                System.out.println("  - " + f.name);
            }
        }

        // Composition: Departments exist only within University
        public class Department {
            String deptName;

            public Department(String deptName) {
                this.deptName = deptName;
            }
        }
    }

    // Aggregation: Faculty can exist independently
    public class Faculty {
        String name;

        public Faculty(String name) {
            this.name = name;
        }
    }
}
