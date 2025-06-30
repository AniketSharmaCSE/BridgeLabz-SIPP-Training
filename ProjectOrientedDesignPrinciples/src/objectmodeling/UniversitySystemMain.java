package objectmodeling;

public class UniversitySystemMain {
    public static void main(String[] args) {
        UniversitySystem system = new UniversitySystem();

        UniversitySystem.University uni = system.new University("MIT");

        // Composition: departments belong to the university
        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");

        // Aggregation: faculty can exist without the university
        UniversitySystem.Faculty f1 = system.new Faculty("Dr. Aniket");
        UniversitySystem.Faculty f2 = system.new Faculty("Dr. Neha");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversityStructure();

       
    }
}
