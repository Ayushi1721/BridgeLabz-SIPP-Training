package Day4_inheritance;
class Vehicle {
 protected int maxSpeed;
 protected String fuelType;

 public Vehicle(int maxSpeed, String fuelType) {
     this.maxSpeed = maxSpeed;
     this.fuelType = fuelType;
 }

 public void displayInfo() {
     System.out.println("Max Speed: " + maxSpeed + " km/h");
     System.out.println("Fuel Type: " + fuelType);
 }
}

class Car extends Vehicle {
 private int seatCapacity;

 public Car(int maxSpeed, String fuelType, int seatCapacity) {
     super(maxSpeed, fuelType);
     this.seatCapacity = seatCapacity;
 }


 public void displayInfo() {
     super.displayInfo();
     System.out.println("Seat Capacity: " + seatCapacity);
 }
}

class Truck extends Vehicle {
 private int loadCapacity; // in kg

 public Truck(int maxSpeed, String fuelType, int loadCapacity) {
     super(maxSpeed, fuelType);
     this.loadCapacity = loadCapacity;
 }


 public void displayInfo() {
     super.displayInfo();
     System.out.println("Load Capacity: " + loadCapacity + " kg");
 }
}

class Motorcycle extends Vehicle {
 private boolean hasStorageBox;

 public Motorcycle(int maxSpeed, String fuelType, boolean hasStorageBox) {
     super(maxSpeed, fuelType);
     this.hasStorageBox = hasStorageBox;
 }

 public void displayInfo() {
     super.displayInfo();
     System.out.println("Has Storage Box: " + (hasStorageBox ? "Yes" : "No"));
 }
}

public class VehicleSystem {
 public static void main(String[] args) {
     Vehicle[] vehicles = new Vehicle[3];

     vehicles[0] = new Car(180, "Petrol", 5);
     vehicles[1] = new Truck(120, "Diesel", 5000);
     vehicles[2] = new Motorcycle(150, "Petrol", true);

     for (int i = 0; i < vehicles.length; i++) {
         System.out.println("Vehicle " + (i + 1) + " Info:");
         vehicles[i].displayInfo();
         System.out.println("-----------------------");
     }
 }
}