package Day3_keywords;

public class Student {
	    static String universityName = "ABC University";
	    static int totalStudents = 0;
	    String name;
	    final int rollNumber;
	    String grade;
	    public Student(String name, int rollNumber, String grade) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	        totalStudents++;
	    }
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Grade: " + grade);
	        System.out.println("University: " + universityName);
	        System.out.println("------------------------");
	    }
	    public static void displayTotalStudents() {
	        System.out.println("Total Students Enrolled: " + totalStudents);
	    }
	    public static void updateGrade(Object obj, String newGrade) {
	        if (obj instanceof Student) {
	            Student s = (Student) obj;
	            s.grade = newGrade;
	            System.out.println("Grade updated for Roll No: " + s.rollNumber);
	        } else {
	            System.out.println("Invalid object! Not a Student.");
	        }
	    }
	    public static void main(String[] args) {
	        Student s1 = new Student("Ayushi", 101, "A");
	        Student s2 = new Student("Rohit", 102, "B");
	        if (s1 instanceof Student) {
	            s1.displayDetails();
	        }
	        if (s2 instanceof Student) {
	            s2.displayDetails();
	        }
	        updateGrade(s2, "A+");
	        s2.displayDetails();
	        displayTotalStudents();
	    }
	}

		  
