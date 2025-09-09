package Linearandbinarysearch;
public class FirstNegativeLinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, -2, 7};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }
        System.out.println("Index of first negative: " + index);
    }
}


