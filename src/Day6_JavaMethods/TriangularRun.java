package Day6_JavaMethods;

import java.util.Scanner;

public class TriangularRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000; // in meters
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 in meters: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 in meters: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 in meters: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to complete 5 km.");
    }
}

