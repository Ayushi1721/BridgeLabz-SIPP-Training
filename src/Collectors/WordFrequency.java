package Collectors;
import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "apple banana apple orange banana apple mango";
        List<String> words = Arrays.asList(paragraph.split(" "));

        Map<String, Long> wordCount = words.stream()
            .collect(Collectors.groupingBy(
                word -> word,
                Collectors.counting()
            ));

        wordCount.forEach((word, count) ->
            System.out.println(word + " -> " + count));
    }
}

