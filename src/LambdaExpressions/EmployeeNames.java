package LambdaExpressions;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}


