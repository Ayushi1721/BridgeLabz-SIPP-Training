package Encapsulationsandpolymorphism;
abstract class Patient {
    private String patientId; private String name; private int age;
    public Patient(String id, String name, int age) { this.patientId=id; this.name=name; this.age=age; }
    public abstract double calculateBill();
    public void getPatientDetails() { System.out.println(name + ", Age: " + age); }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    public InPatient(String id, String name, int age) { super(id, name, age); }
    public double calculateBill() { return 5000; }
    public void addRecord(String r) { records.add(r); }
    public void viewRecords() { records.forEach(System.out::println); }
}

