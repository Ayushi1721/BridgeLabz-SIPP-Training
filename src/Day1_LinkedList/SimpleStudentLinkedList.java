package Day1_LinkedList;

class Student {
    int roll;
    String name;
    Student next;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
        this.next = null;
    }
}

public class SimpleStudentLinkedList {
    Student head;

    public void addStudent(int roll, String name) {
        Student newStudent = new Student(roll, name);
        newStudent.next = head;
        head = newStudent;
    }

    public void deleteStudent(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.roll != roll) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void searchStudent(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println(temp.roll + " " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    public void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SimpleStudentLinkedList list = new SimpleStudentLinkedList();
        list.addStudent(1, "Ayushi Baliyan");
        list.addStudent(2, "Ayushi Verma");
        list.addStudent(3, "Ayushi Agarwal");

        System.out.println("All Students:");
        list.display();

        System.out.println("Search the roll number:");
        list.searchStudent(1);

        System.out.println("Delete the roll number:");
        list.deleteStudent(2);

        System.out.println("After deletion:");
        list.display();
    }
}
