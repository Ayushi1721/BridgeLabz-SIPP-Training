package Day3_keywords;

public class Employee {
    static String companyName = "Microsoft";
    String name;
    int id;
    final String designation;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
    public static void main(String[] args) {
        Employee.displayCompanyName();
        Employee employee1 = new Employee("Ram", 23, "Training Master");

        if (employee1 instanceof Employee) {
            System.out.println("\nEmployee Details:");
            employee1.displayDetails();
        } else {
            System.out.println("Not a valid employee.");
        }
    }
}
