package StreamAPI;
import java.util.*;
import java.util.stream.*;

class Claim {
    private String type;
    private double amount;

    public Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class ClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 1200.50),
            new Claim("Car", 2300.75),
            new Claim("Car", 1500.00),
            new Claim("Health", 800.00),
            new Claim("Home", 5000.00)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(
                Claim::getType,
                Collectors.averagingDouble(Claim::getAmount)
            ));

        avgClaims.forEach((type, avg) -> 
            System.out.println(type + " Avg Claim: " + avg));
    }
}

