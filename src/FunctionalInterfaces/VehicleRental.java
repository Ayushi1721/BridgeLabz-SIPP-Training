package FunctionalInterfaces;
interface VehicleRental {
    void rent();
    void returnVehicle();
}

class Car implements VehicleRental {
    public void rent() { System.out.println("Car rented"); }
    public void returnVehicle() { System.out.println("Car returned"); }
}

class Bike implements VehicleRental {
    public void rent() { System.out.println("Bike rented"); }
    public void returnVehicle() { System.out.println("Bike returned"); }
}

class Bus implements VehicleRental {
    public void rent() { System.out.println("Bus rented"); }
    public void returnVehicle() { System.out.println("Bus returned"); }
}


