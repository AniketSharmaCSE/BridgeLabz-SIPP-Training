package objectmodeling;

public class SchoolSystemMain {
    public static void main(String[] args) {
        SchoolSystem system = new SchoolSystem();

        SchoolSystem.School school = system.new School("Green Valley School");

        SchoolSystem.Course math = system.new Course("Math");
        SchoolSystem.Course english = system.new Course("English");

        SchoolSystem.Student s1 = system.new Student("Aniket");
        SchoolSystem.Student s2 = system.new Student("Neha");

        // Enroll students in courses
        s1.enroll(math);
        s1.enroll(english);
        s2.enroll(math);

        // Add students to school
        school.addStudent(s1);
        school.addStudent(s2);

        // Display data
        s1.viewCourses();
        s2.viewCourses();
        math.showEnrolledStudents();
        english.showEnrolledStudents();
        school.showStudents();
    }
}

