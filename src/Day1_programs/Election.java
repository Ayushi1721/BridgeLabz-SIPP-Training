package Day1_programs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Election {

    static class Voter {
        String name;
        int age;
        String candidate;

        Voter(String name, int age, String candidate) {
            this.name = name;
            this.age = age;
            this.candidate = candidate;
        }

        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Voted for: " + candidate;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Voter> voters = new ArrayList<>();

        int candidate1 = 0, candidate2 = 0, candidate3 = 0;

        System.out.println("Welcome to the Polling Booth System");
        System.out.println("Type 'exit' as name or enter age 0417 to stop voting.\n");

        while (true) {
            System.out.print("Enter your name: ");
            String name = scanner.next();
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age == 9999) break;

            if (age < 18) {
                System.out.println("You are not eligible to vote.\n");
                continue;
            }

            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");
            System.out.print("Vote (1-3): ");
            int vote = scanner.nextInt();

            String candidate = "";

            switch (vote) {
                case 1: candidate1++; candidate = "Candidate A"; break;
                case 2: candidate2++; candidate = "Candidate B"; break;
                case 3: candidate3++; candidate = "Candidate C"; break;
                default:
                    System.out.println("Invalid vote.\n");
                    continue;
            }

            voters.add(new Voter(name, age, candidate));
            System.out.println("Vote recorded for " + candidate + "\n");
        }

        try {
            FileWriter writer = new FileWriter("results.txt");

            writer.write("---- Election Summary ----\n");
            writer.write("Votes for Candidate A: " + candidate1 + "\n");
            writer.write("Votes for Candidate B: " + candidate2 + "\n");
            writer.write("Votes for Candidate C: " + candidate3 + "\n\n");

            writer.write("---- Voter Records ----\n");
            for (Voter v : voters) {
                writer.write(v.toString() + "\n");
            }

            writer.close();
            System.out.println("Election data written to results.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}