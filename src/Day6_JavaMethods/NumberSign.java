package Day6_JavaMethods;

import java.util.Scanner;

public class NumberSign {
    public static int checkSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = checkSign(num);
        if (result > 0) System.out.println("The number is positive.");
        else if (result < 0) System.out.println("The number is negative.");
        else System.out.println("The number is zero.");
    }
}

