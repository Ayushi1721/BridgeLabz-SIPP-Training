package Sortingalgo;
import java.util.Arrays;

public class SelectionSortDemo {
    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int temp = scores[i]; scores[i] = scores[minIdx]; scores[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {78, 92, 85, 66, 88};
        selectionSort(examScores);
        System.out.println("Sorted Exam Scores: " + Arrays.toString(examScores));
    }
}

