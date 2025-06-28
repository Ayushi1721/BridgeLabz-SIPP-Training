package Day1_programs;

import java.util.*;


public class Studentscores {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();
	        int[] scores = new int[n];
	        int sum = 0;

	        // Input scores with validation
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter score for student " + (i + 1) + ": ");
	            int score = sc.nextInt();
	            if (score < 0) {
	                System.out.println("Invalid score! Must be non-negative.");
	                i--; continue;
	            }
	            scores[i] = score;
	            sum += score;
	        }

	        double average = sum / (double) n;
	        int max = scores[0], min = scores[0];
	        for (int i = 1; i < n; i++) {
	            if (scores[i] > max) max = scores[i];
	            if (scores[i] < min) min = scores[i];
	        }

	        System.out.println("\nAverage score: " + average);
	        System.out.println("Highest score: " + max);
	        System.out.println("Lowest score: " + min);

	        System.out.println("Scores above average:");
	        for (int score : scores) {
	            if (score > average) System.out.println(score);
	        }

	        sc.close();
	    }
	}