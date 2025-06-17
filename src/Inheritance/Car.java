package Inheritance;

public class Car extends Vehicle {
    String brand;
    int year;

    public Car(){
        super();
        System.out.println("Car Constructor");

    }
    public Car(String engine, String tyre, int seats, String brand, int year) {
        super(engine, tyre, seats);
        this.brand = brand;
        this.year = year;
    }

    public void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
