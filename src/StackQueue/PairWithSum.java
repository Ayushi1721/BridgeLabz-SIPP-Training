package StackQueue;
import java.util.*;

public class PairWithSum {
    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 2};
        int target = 9;
        System.out.println("Pair exists: " + hasPair(arr, target)); // true
    }
}


