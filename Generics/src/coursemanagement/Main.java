package coursemanagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create Course objects for different types
        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse("Calculus I"));
        Course<AssignmentCourse> english = new Course<>("Literature", new AssignmentCourse("Modern Poetry"));
        Course<ResearchCourse> biology = new Course<>("Biology", new ResearchCourse("Genetics Research"));

        // Create lists for all course types
        List<CourseType> allCourseTypes = new ArrayList<>();
        allCourseTypes.add(math.getCourseType());
        allCourseTypes.add(english.getCourseType());
        allCourseTypes.add(biology.getCourseType());

        // Print all evaluation methods using wildcard
        CourseUtil.printAllCourses(allCourseTypes);
        
        System.out.println(math);
        System.out.println(english);
        System.out.println(biology);
    }
}
