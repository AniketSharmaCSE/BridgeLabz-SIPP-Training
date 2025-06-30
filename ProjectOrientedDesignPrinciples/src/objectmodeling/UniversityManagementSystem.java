package objectmodeling;

public class UniversityManagementSystem {

    public class Student {
        String name;
        Course enrolledCourse;

        public Student(String name) {
            this.name = name;
        }

        public void enrollCourse(Course course) {
            enrolledCourse = course;
            System.out.println(name + " enrolled in " + course.courseName);
        }
    }

    public class Professor {
        String name;
        Course assignedCourse;

        public Professor(String name) {
            this.name = name;
        }

        public void assignProfessor(Course course) {
            assignedCourse = course;
            System.out.println("Professor " + name + " assigned to " + course.courseName);
        }
    }

    public class Course {
        String courseName;

        public Course(String courseName) {
            this.courseName = courseName;
        }
    }
}

