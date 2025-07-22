package resumescreeningsystem;

//Abstract class for all job roles
abstract class JobRole {
 private String roleName;

 public JobRole(String roleName) {
     this.roleName = roleName;
 }

 public String getRoleName() {
     return roleName;
 }

 // Each job role will provide its top required skill
 public abstract String requiredSkill();
}

//Software Engineer job role
class SoftwareEngineer extends JobRole {
 public SoftwareEngineer() { super("Software Engineer"); }
 public String requiredSkill() { return "Java"; }
}

//Data Scientist job role
class DataScientist extends JobRole {
 public DataScientist() { super("Data Scientist"); }
 public String requiredSkill() { return "Python"; }
}

//Product Manager job role
class ProductManager extends JobRole {
 public ProductManager() { super("Product Manager"); }
 public String requiredSkill() { return "Leadership"; }
}