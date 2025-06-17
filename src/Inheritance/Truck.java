package Inheritance;

public class Truck extends Vehicle {
    String model;
    String color;

    public Truck(String engine, String tyre, int seats, String model, String color) {
        super(engine, tyre, seats);
        this.model = model;
        this.color = color;
    }

    public void displayTruckInfo() {
        displayVehicleInfo();
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}
