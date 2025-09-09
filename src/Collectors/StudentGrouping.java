package Collectors;
import java.util.*;
import java.util.stream.*;

class Student {
    private String name;
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
    public String getName() { return name; }
    public String getGradeLevel() { return gradeLevel; }
}

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "Grade 10"),
            new Student("Bob", "Grade 11"),
            new Student("Charlie", "Grade 10"),
            new Student("David", "Grade 12")
        );

        Map<String, List<String>> groupedByGrade = students.stream()
            .collect(Collectors.groupingBy(
                Student::getGradeLevel,
                Collectors.mapping(Student::getName, Collectors.toList())
            ));

        groupedByGrade.forEach((grade, names) ->
            System.out.println(grade + " -> " + names));
    }
}
