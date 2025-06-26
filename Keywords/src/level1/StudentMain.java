package level1;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Aniket", 201, "A");
        Student s2 = new Student("Priya", 202, "B+");

        // Check using instanceof
        if (s1 instanceof Student) {
            s1.showDetails();
        }

        if (s2 instanceof Student) {
            s2.showDetails();
        }

        // Display total students
        Student.displayTotalStudents();
    }
}
