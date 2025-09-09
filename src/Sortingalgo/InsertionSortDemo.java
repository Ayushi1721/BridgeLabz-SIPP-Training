package Sortingalgo;
import java.util.Arrays;

public class InsertionSortDemo {
    public static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {102, 101, 105, 103, 104};
        insertionSort(employeeIds);
        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIds));
    }
}


