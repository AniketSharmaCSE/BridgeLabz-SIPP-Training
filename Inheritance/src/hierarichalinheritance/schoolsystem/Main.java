package hierarichalinheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Sharma", 40, "Math");
        Student student = new Student("Aniket", 18, 12);
        Staff staff = new Staff("Mrs. Roy", 35, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
