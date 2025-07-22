package resumescreeningsystem;

//Generic Resume class; T must be a type of JobRole
class Resume<T extends JobRole> {
 private String candidateName;
 private T jobRole;

 public Resume(String candidateName, T jobRole) {
     this.candidateName = candidateName;
     this.jobRole = jobRole;
 }

 public String getCandidateName() { return candidateName; }
 public T getJobRole() { return jobRole; }

 // For printing resume info
 public String toString() {
     return candidateName + " | " + jobRole.getRoleName() + " | Skill: " + jobRole.requiredSkill();
 }
}
