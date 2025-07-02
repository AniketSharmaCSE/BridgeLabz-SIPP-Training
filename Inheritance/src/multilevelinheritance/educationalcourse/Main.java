package multilevelinheritance.educationalcourse;
public class Main {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Java Programming", 40, "Udemy", true, 2000, 10);

        System.out.println("Course: " + course.courseName);
        System.out.println("Duration: " + course.duration + " hours");
        System.out.println("Platform: " + course.platform);
        System.out.println("Recorded: " + course.isRecorded);
        System.out.println("Fee: Rs." + course.fee);
        System.out.println("Discount: " + course.discount + "%");
    }
}
