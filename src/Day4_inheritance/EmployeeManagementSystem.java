package Day4_inheritance;
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String college;

    public Intern(String name, int id, double salary, String college) {
        super(name, id, salary);
        this.college = college;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("College: " + college);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m = new Manager("Rajeev", 101, 80000, 5);
        Developer d = new Developer("Sneha", 102, 60000, "Java");
        Intern i = new Intern("Amit", 103, 15000, "IIT Delhi");

        System.out.println("=== Manager Details ===");
        m.displayDetails();

        System.out.println("\n=== Developer Details ===");
        d.displayDetails();

        System.out.println("\n=== Intern Details ===");
        i.displayDetails();
    }
}
