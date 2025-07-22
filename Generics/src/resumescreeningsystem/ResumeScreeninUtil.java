package resumescreeningsystem;

import java.util.*;

class ResumeScreeningUtil {
 // Wildcard method
 public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
     for (Resume<? extends JobRole> res : resumes) {
         System.out.println(res);
     }
 }
}
