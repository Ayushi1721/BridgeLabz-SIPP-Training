package Submissionofalgo;
import java.util.Arrays;
import java.util.Random;

public class SearchPerformance {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(1000000, 0, 1000000).toArray();
        int target = arr[500000];
        Arrays.sort(arr); // required for binary search

        long start = System.nanoTime();
        System.out.println("Linear Search Index: " + linearSearch(arr, target));
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start)/1e6 + " ms");

        start = System.nanoTime();
        System.out.println("Binary Search Index: " + binarySearch(arr, target));
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start)/1e6 + " ms");
    }
}


