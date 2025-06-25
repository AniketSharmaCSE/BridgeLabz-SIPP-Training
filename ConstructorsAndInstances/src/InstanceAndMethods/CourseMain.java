package InstanceAndMethods;

public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 400);
        Course c2 = new Course("Web Development", 8, 500);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("CodeMasters Institute");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
