package Linearandbinarysearch;
public class StringBuilderReverse {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String: " + sb.toString());
    }
}

