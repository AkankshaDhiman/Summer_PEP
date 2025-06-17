package Inheritance;

public class Vehicle {
    String engine;
    String tyre;
    int seats;

    public Vehicle() {
        System.out.println("Vehicle Constructor");
    }
    public Vehicle(String engine, String tyre, int seats) {
        this.engine = engine;
        this.tyre = tyre;
        this.seats = seats;
    }

    public void displayVehicleInfo() {
        System.out.println("Engine: " + engine);
        System.out.println("Tyres: " + tyre);
        System.out.println("Seats: " + seats);
    }
}
