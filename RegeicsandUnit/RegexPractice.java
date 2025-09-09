package RegeicsandUnit;
import java.util.regex.*;
import java.util.*;

public class RegexPractice {
    public static void main(String[] args) {
        // 1️⃣ Validate Username
        String[] usernames = {"user_123", "123user", "us"};
        System.out.println("Username Validation:");
        for (String username : usernames) {
            boolean isValid = username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
            System.out.println(username + " → " + (isValid ? "Valid" : "Invalid"));
        }
        System.out.println();

        // 2️⃣ Validate License Plate
        String[] plates = {"AB1234", "A12345"};
        System.out.println("License Plate Validation:");
        for (String plate : plates) {
            boolean isValid = plate.matches("^[A-Z]{2}\\d{4}$");
            System.out.println(plate + " → " + (isValid ? "Valid" : "Invalid"));
        }
        System.out.println();

        // 3️⃣ Validate Hex Color Code
        String[] colors = {"#FFA500", "#ff4500", "#123"};
        System.out.println("Hex Color Validation:");
        for (String color : colors) {
            boolean isValid = color.matches("^#[0-9A-Fa-f]{6}$");
            System.out.println(color + " → " + (isValid ? "Valid" : "Invalid"));
        }
        System.out.println();

        // 4️⃣ Extract All Email Addresses
        String emailText = "Contact us at support@example.com and info@company.org";
        System.out.println("Extract Emails:");
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
        Matcher emailMatcher = emailPattern.matcher(emailText);
        while(emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }
        System.out.println();

        // 5️⃣ Extract Capitalized Words
        String capitalText = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println("Capitalized Words:");
        Pattern capitalPattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher capitalMatcher = capitalPattern.matcher(capitalText);
        while(capitalMatcher.find()) {
            System.out.println(capitalMatcher.group());
        }
        System.out.println();

        // 6️⃣ Extract Dates (dd/mm/yyyy)
        String dateText = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        System.out.println("Dates:");
        Pattern datePattern = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
        Matcher dateMatcher = datePattern.matcher(dateTex

