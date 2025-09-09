package LambdaExpressions;
import java.util.function.Consumer;

public class SmartHome {
    public static void main(String[] args) {
        Consumer<String> motionSensor = (pattern) -> System.out.println("Motion detected: " + pattern);
        Consumer<String> timeOfDay = (pattern) -> System.out.println("Time of day trigger: " + pattern);
        Consumer<String> voiceCommand = (pattern) -> System.out.println("Voice command received: " + pattern);

        // Execute light patterns dynamically
        motionSensor.accept("Turn on hallway lights");
        timeOfDay.accept("Dim living room lights");
        voiceCommand.accept("Turn off all lights");
    }
}

