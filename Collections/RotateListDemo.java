package Collections;
import java.util.*;

public class RotateListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotateList(list, 2);
        System.out.println(list);
    }

    public static <T> void rotateList(List<T> list, int positions) {
        int n = list.size();
        positions = positions % n;
        List<T> temp = new ArrayList<>(list.subList(0, positions));
        list.subList(0, positions).clear();
        list.addAll(temp);
    }
}
