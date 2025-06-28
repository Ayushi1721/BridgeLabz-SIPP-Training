package Day5_Javastring;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void throwStringIndexOutOfBounds(String text) {
        System.out.println(text.charAt(text.length())); // causes exception
    }

    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // throwStringIndexOutOfBounds(text); // causes crash

        handleStringIndexOutOfBounds(text); // safe call
    }
}
