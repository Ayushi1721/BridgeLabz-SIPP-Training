package Sortingalgo;
import java.util.Arrays;

public class CountingSortDemo {
    public static void countingSort(int[] ages, int min, int max) {
        int[] count = new int[max - min + 1];
        for (int age : ages) count[age - min]++;
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) ages[index++] = i + min;
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 14, 10, 13, 12};
        countingSort(ages, 10, 18);
        System.out.println("Sorted Ages: " + Arrays.toString(ages));
    }
}

