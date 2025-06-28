package Day4_Array;

import java.util.Scanner;

public class Table6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] result = new int[4]; // For 6, 7, 8, 9

        for (int i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }
    }
}

