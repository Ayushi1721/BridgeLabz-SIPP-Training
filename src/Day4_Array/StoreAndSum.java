package Day4_Array;

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        int index = 0;
        double total = 0;

        while (true) {
            if (index == 10) break;

            System.out.print("Enter number (0 or negative to stop): ");
            double value = sc.nextDouble();
            if (value <= 0) break;

            numbers[index++] = value;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println("Value " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("Total sum: " + total);
    }
}

