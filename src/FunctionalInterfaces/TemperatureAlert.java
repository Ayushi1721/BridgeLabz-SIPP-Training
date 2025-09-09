package FunctionalInterfaces;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isTooHot = temp -> temp > 37.5;

        double temperature = 38.2;
        if(isTooHot.test(temperature)) {
            System.out.println("Alert: Temperature exceeds threshold!");
        }
    }
}

