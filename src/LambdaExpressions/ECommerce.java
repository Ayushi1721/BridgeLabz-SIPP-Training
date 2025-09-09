package LambdaExpressions;
import java.util.*;
import java.util.stream.Collectors;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " [Price: " + price + ", Rating: " + rating + ", Discount: " + discount + "]";
    }
}

public class ECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200, 4.5, 10),
            new Product("Phone", 800, 4.7, 15),
            new Product("Headphones", 150, 4.3, 5)
        );

        // Sort by price dynamically
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by price: " + products);

        // Sort by rating dynamically
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("Sorted by rating: " + products);
    }
}

