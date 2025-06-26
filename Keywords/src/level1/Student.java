package level1;

public class Student {
    //Static variable shared across all students
    static String universityName = "GLA University";

    //Final variable for roll number
    final int rollNumber;

    //Instance variables
    String name;
    String grade;

    //Static counter for total students
    static int totalStudents = 0;

    //Constructor using this. keyword
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    //Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    //Method to display student details
    public void showDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
