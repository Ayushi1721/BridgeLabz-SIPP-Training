package Collectors;
import java.util.*;
import java.util.stream.*;

class Order {
    private String customer;
    private double total;

    public Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

public class OrderSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 120.50),
            new Order("Bob", 99.99),
            new Order("Alice", 300.75),
            new Order("Charlie", 150.00)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomer,
                Collectors.summingDouble(Order::getTotal)
            ));

        revenueByCustomer.forEach((customer, total) ->
            System.out.println(customer + " -> $" + total));
    }
}

