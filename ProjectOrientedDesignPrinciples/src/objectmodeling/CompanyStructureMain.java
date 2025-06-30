package objectmodeling;

public class CompanyStructureMain {
    public static void main(String[] args) {
        CompanyStructure structure = new CompanyStructure();
        CompanyStructure.Company company = structure.new Company("TechCorp");

        company.addDepartment("HR");
        company.addDepartment("Development");

        company.showStructure();

        
    }
}
