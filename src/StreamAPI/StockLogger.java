package StreamAPI;
import java.util.*;

public class StockLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(120.5, 123.7, 119.8, 121.9);

        stockPrices.forEach(System.out::println);
    }
}


