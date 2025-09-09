package LambdaExpressions;
import java.util.*;

public class PatientIDs {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P101", "P102", "P103");

        // Method reference to print each ID
        patientIds.forEach(System.out::println);
    }
}


