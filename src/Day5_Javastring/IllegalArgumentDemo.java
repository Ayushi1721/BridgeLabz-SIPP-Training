package Day5_Javastring;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void throwIllegalArgument(String text) {
        System.out.println(text.substring(5, 3)); // start > end = exception
    }

    public static void handleIllegalArgument(String text) {
        try {
            System.out.println(text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // throwIllegalArgument(text); // unsafe

        handleIllegalArgument(text); // safe
    }
}
