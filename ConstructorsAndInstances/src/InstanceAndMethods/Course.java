package InstanceAndMethods;

public class Course {
    String courseName;
    int duration; // in weeks
    double fee;
    static String instituteName = "Tech Academy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: rs. " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}
