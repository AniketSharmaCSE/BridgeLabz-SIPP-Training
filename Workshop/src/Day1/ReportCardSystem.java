package Day1;
import java.util.*;

class InvalidMarkException extends RuntimeException {
    public InvalidMarkException(String message) {
        super(message);
    }
}

class Student {
    String name;
    String[] subjects;
    int[] marks;

    public Student(String name, String[] subjects, int[] marks) {
        if (subjects.length != marks.length) {
            throw new IllegalArgumentException("Subjects and marks count must match.");
        }

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100.");
            }
        }

        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    String assignGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    void displayReportCard() {
        System.out.println("Report Card for: " + name);
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-15s : %3d\n", subjects[i], marks[i]);
        }
        double avg = calculateAverage();
        String grade = assignGrade(avg);
        System.out.printf("Average         : %.2f\n", avg);
        System.out.println("Grade           : " + grade);
    }
}

public class ReportCardSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try {
            students.add(new Student("Aniket", new String[]{"Math", "Science", "English"}, new int[]{90, 85, 88}));
            students.add(new Student("Riya", new String[]{"Math", "Science", "English"}, new int[]{70, 65, 80}));
            students.add(new Student("Rahul", new String[]{"Math", "Science", "English"}, new int[]{45, 60, 55}));
            
            //students.add(new Student("Invalid", new String[]{"Math", "Science"}, new int[]{101, 90}));
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Student s : students) {
            s.displayReportCard();
        }
    }
}
