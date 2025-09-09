package Day3_keywords;

public class Patient {
	    static String hospitalName = "CityCare Hospital";
	    static int patientCount = 0;
	    String name;
	    int age;
	    String ailment;
	    final int patientID;
	    public Patient(String name, int age, String ailment) {
	        this.name = name;
	        this.age = age;
	        this.ailment = ailment;
	        this.patientID = ++patientCount;
	    }
	    public static int getTotalPatients() {
	        return patientCount;
	    }
	    public void displayDetails() {
	        System.out.println("Hospital Name: " + hospitalName);
	        System.out.println("Patient ID   : " + patientID);
	        System.out.println("Name         : " + name);
	        System.out.println("Age          : " + age);
	        System.out.println("Ailment      : " + ailment);
	        System.out.println("------------------------------------");
	    }
	    public static void main(String[] args) {
	        Object p1 = new Patient("Ayushi Baliyan", 25, "Fever");
	        Object p2 = new Patient("Rohit Sharma", 30, "Back Pain");

	        if (p1 instanceof Patient) {
	            ((Patient) p1).displayDetails();
	        }

	        if (p2 instanceof Patient) {
	            ((Patient) p2).displayDetails();
	        }

	        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
	    }
	}