package Collections;
import java.util.*;

public class NthFromEndDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(findNthFromEnd(list, 2)); // Output: D
    }

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        for (int i = 0; i < n; i++) {
            if (first.hasNext()) first.next();
            else return null;
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }
}

