package Day1_oops.Level2;

public class Student {
	    String name;
	    int rollNumber;
	    double marks;

	    public Student(String name, int rollNumber, double marks) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = marks;
	    }

	    public char calculateGrade() {
	        if (marks >= 90) return 'A';
	        else if (marks >= 75) return 'B';
	        else if (marks >= 60) return 'C';
	        else if (marks >= 50) return 'D';
	        else return 'F';
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + calculateGrade());
	    }

	    public static void main(String[] args) {
	        Student s1 = new Student("Ayushi", 101, 82.5);
	        s1.displayDetails();
	    }
	}

