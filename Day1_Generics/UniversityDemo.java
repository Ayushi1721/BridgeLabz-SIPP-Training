package Day1_Generics;
import java.util.ArrayList;
import java.util.List;

// Abstract course types
abstract class CourseType {
    private String courseName;
    public CourseType(String name) { this.courseName = name; }
    public String getCourseName() { return courseName; }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) { super(name); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) { super(name); }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) { super(name); }
}

// Generic course class
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    public void addCourse(T course) { courses.add(course); }
    public List<T> getCourses() { return courses; }

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}

// Demo
public class UniversityDemo {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Math Exam"));
        examCourses.addCourse(new ExamCourse("Physics Exam"));

        System.out.println("Exam Courses:");
        Course.displayCourses(examCourses.getCourses());
    }
}
