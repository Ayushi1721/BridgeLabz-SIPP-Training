package FunctionalInterfaces;
import java.util.function.Function;

public class MessageChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = String::length;

        String message = "Hello, world!";
        System.out.println("Message length: " + lengthChecker.apply(message));
    }
}


