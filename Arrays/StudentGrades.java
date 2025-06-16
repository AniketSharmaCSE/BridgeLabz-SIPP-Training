import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
		
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) {
                System.out.println("Invalid marks! Re-enter student data.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Invalid marks! Re-enter student data.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) {
                System.out.println("Invalid marks! Re-enter student data.");
                i--;
                continue;
            }

            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 70)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else if (percentage[i] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }
		
        System.out.println("Student Results: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %s\n",
                (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}
