package Linearandbinarysearch;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        System.out.println("String without duplicates: " + sb.toString());
    }
}


