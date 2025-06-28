package Day5_Javastring;

import java.util.Scanner;

public class StringToCharArrayCompare {
    public static char[] customToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] customChars = customToCharArray(text);
        char[] builtInChars = text.toCharArray();
        boolean areEqual = compareCharArrays(customChars, builtInChars);

        System.out.println("Characters using custom method: " + new String(customChars));
        System.out.println("Characters using toCharArray(): " + new String(builtInChars));
        System.out.println("Are both char arrays equal? " + areEqual);
    }
}
