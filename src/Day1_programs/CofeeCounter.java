package Day1_programs;
import java.util.*;

public class CofeeCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello!");

        while (true) {
            System.out.println("Choose a coffee type:");
            System.out.println("1. Latte");
            System.out.println("2. Espresso");
            System.out.println("3. Americano");
            System.out.println("4. Vanilla Latte");
            System.out.println("Type 'exit' to quit.");
            System.out.print("Enter your choice (1-4) or exit: ");

            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting! Have a great day ☕");
                break;
            }

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number or 'exit'.");
                continue;
            }

            int price;
            switch (choice) {
                case 1:
                    price = 150;
                    System.out.println("You chose Latte.");
                    break;
                case 2:
                    price = 100;
                    System.out.println("You chose Espresso.");
                    break;
                case 3:
                    price = 80;
                    System.out.println("You chose Americano.");
                    break;
                case 4:
                    price = 250;
                    System.out.println("You chose Vanilla Latte.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int subtotal = price * quantity;
            double gst = subtotal * 0.18; 
            double total = subtotal + gst;

            System.out.println("Subtotal: ₹" + subtotal);
            System.out.println("GST @ 18%: ₹" + gst);
            System.out.println("Total Bill: ₹" + total);
            System.out.println("Your order has been placed successfully!\n");
        }

        sc.close();
    }
}
