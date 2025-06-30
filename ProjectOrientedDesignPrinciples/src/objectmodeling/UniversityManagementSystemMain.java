package objectmodeling;

public class UniversityManagementSystemMain{
    public static void main(String[] args) {
        UniversityManagementSystem ums = new UniversityManagementSystem();

        UniversityManagementSystem.Course course = ums.new Course("JAVA");

        UniversityManagementSystem.Student student = ums.new Student("Aniket");
        UniversityManagementSystem.Professor prof = ums.new Professor("Sharma");

        student.enrollCourse(course);
        prof.assignProfessor(course);
    }
}
