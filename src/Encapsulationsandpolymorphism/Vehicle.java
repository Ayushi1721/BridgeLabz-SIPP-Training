package Encapsulationsandpolymorphism;
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number; this.type = type; this.rentalRate = rate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) { super(number, "Car", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Car Insurance"; }
}

