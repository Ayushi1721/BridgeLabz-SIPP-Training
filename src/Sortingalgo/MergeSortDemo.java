package Sortingalgo;
import java.util.Arrays;

public class MergeSortDemo {
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    private static void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        double[] L = new double[n1];
        double[] R = new double[n2];
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        double[] bookPrices = {199.99, 89.50, 149.75, 79.25};
        mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("Sorted Book Prices: " + Arrays.toString(bookPrices));
    }
}

