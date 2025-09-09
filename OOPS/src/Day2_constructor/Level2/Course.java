package Day2_constructor.Level2;
public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Institute";

    public Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName + " (" + duration + " weeks) - ₹" + fee + " | " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 12, 12000);
        c1.displayCourseDetails();
        Course.updateInstituteName("Code Academy");
        Course c2 = new Course("Python", 10, 10000);
        c2.displayCourseDetails();
    }
}
