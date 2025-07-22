package resumescreeningsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a list to store resumes for different job roles
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();

        // Add some sample resumes
        resumes.add(new Resume<>("Rahul", new SoftwareEngineer()));
        resumes.add(new Resume<>("Anshu", new DataScientist()));
        resumes.add(new Resume<>("Aniket", new ProductManager()));

        // Screen all resumes using the utility method
        ResumeScreeningUtil.screenResumes(resumes);
    }
}
