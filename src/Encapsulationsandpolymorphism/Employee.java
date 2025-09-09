package Encapsulationsandpolymorphism;
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = salary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double salary) { this.baseSalary = salary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) { super(id, name, salary); }
    public double calculateSalary() { return getBaseSalary(); }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, hours * rate);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public double calculateSalary() { return hoursWorked * hourlyRate; }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

