package LambdaExpressions;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class HospitalAlerts {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate high"),
            new Alert("Info", "Patient checkup scheduled"),
            new Alert("Warning", "Low medication stock")
        );

        // Predicate for critical alerts
        Predicate<Alert> criticalAlerts = a -> a.type.equals("Critical");

        List<Alert> filtered = alerts.stream()
                                     .filter(criticalAlerts)
                                     .collect(Collectors.toList());

        System.out.println("Filtered alerts: " + filtered);
    }
}


