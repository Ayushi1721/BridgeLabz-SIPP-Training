package FunctionalInterfaces;
interface TestConverter {
    static double kmToMiles(double km) { return km * 0.621371; }
    static double kgToLbs(double kg) { return kg * 2.20462; }
}

public class TestConverter {
    public static void main(String[] args) {
        System.out.println("10 km = " + TestConverter.kmToMiles(10) + " miles");
        System.out.println("5 kg = " + TestConverter.kgToLbs(5) + " lbs");
    }
}

