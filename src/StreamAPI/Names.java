package StreamAPI;
import java.util.*;
import java.util.stream.*;

public class Names {
    public static void main(String[] args) {
        List<String> customers = Arrays.asList("alice", "bob", "charlie", "david");

        List<String> formattedNames = customers.stream()
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        formattedNames.forEach(System.out::println);
    }
}

