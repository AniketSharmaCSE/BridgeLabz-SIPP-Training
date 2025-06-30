package objectmodeling;

import java.util.*;

public class SchoolSystem {

    public class School {
        String name;
        ArrayList<Student> students;

        public School(String name) {
            this.name = name;
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void showStudents() {
            System.out.println("School: " + name);
            for (Student s : students) {
                System.out.println(" Student: " + s.name);
            }
        }
    }

    public class Student {
        String name;
        ArrayList<Course> courses;

        public Student(String name) {
            this.name = name;
            courses = new ArrayList<>();
        }

        public void enroll(Course course) {
            if (!courses.contains(course)) {
                courses.add(course);
                course.addStudent(this); // two-way association
            }
        }

        public void viewCourses() {
            System.out.println("Courses for " + name + ":");
            for (Course c : courses) {
                System.out.println(" " + c.courseName);
            }
        }
    }

    public class Course {
        String courseName;
        ArrayList<Student> enrolledStudents;

        public Course(String courseName) {
            this.courseName = courseName;
            enrolledStudents = new ArrayList<>();
        }

        public void addStudent(Student student) {
            if (!enrolledStudents.contains(student)) {
                enrolledStudents.add(student);
            }
        }

        public void showEnrolledStudents() {
            System.out.println("Students in " + courseName + ":");
            for (Student s : enrolledStudents) {
                System.out.println(" " + s.name);
            }
        }
    }
}


