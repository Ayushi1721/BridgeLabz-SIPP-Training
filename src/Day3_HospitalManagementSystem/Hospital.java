package Day3_HospitalManagementSystem;

interface Payable {
    double calculatePayment();
}

class Doctor {
    String name;
    String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization);
    }
}

class Patient {
    protected String name;
    protected int age;
    private String medicalHistory;
    protected Doctor assignedDoctor;
    public Patient(String name, int age, String medicalHistory, Doctor doctor) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.assignedDoctor = doctor;
    }
    public Patient(String name, Doctor doctor) {
        this.name = name;
        this.age = 0;
        this.medicalHistory = "Emergency";
        this.assignedDoctor = doctor;
    }

    public String getSummary() {
        return "Patient Name: " + name + ", Age: " + age + ", Doctor: " + assignedDoctor.name;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

class InPatient extends Patient {
    int daysAdmitted;

    public InPatient(String name, int age, String medicalHistory, Doctor doctor, int daysAdmitted) {
        super(name, age, medicalHistory, doctor);
        this.daysAdmitted = daysAdmitted;
    }
    public void displayInfo() {
        System.out.println(getSummary() + ", Type: InPatient, Days Admitted: " + daysAdmitted);
    }
}

class OutPatient extends Patient {
    String visitDate;

    public OutPatient(String name, int age, String medicalHistory, Doctor doctor, String visitDate) {
        super(name, age, medicalHistory, doctor);
        this.visitDate = visitDate;
    }
    public void displayInfo() {
        System.out.println(getSummary() + ", Type: OutPatient, Visit Date: " + visitDate);
    }
}

class Bill implements Payable {
    private double baseCharge;
    private double taxPercent;
    private double discount;

    public Bill(double baseCharge, double taxPercent, double discount) {
        this.baseCharge = baseCharge;
        this.taxPercent = taxPercent;
        this.discount = discount;
    }
    public double calculatePayment() {
        double tax = baseCharge * taxPercent / 100;
        double total = baseCharge + tax - discount;
        return total;
    }

    public void printBill() {
        System.out.println("Total Bill: ₹" + calculatePayment());
    }
}

public class Hospital {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Dr. Ankit", "Cardiology");
        Doctor doc2 = new Doctor("Dr. Ram", "Dentist");
        InPatient p1 = new InPatient("Akash", 18, "Heart Issue", doc1, 5);
        OutPatient p2 = new OutPatient("Dhruv", 20, "Teeth Pain", doc2, "2025-09-17");
        p1.displayInfo();
        doc1.displayInfo();
        Bill bill1 = new Bill(6000, 18, 500);
        bill1.printBill();

        System.out.println();

        p2.displayInfo();
        doc2.displayInfo();
        Bill bill2 = new Bill(3000, 20, 400);
        bill2.printBill();
    }
}
