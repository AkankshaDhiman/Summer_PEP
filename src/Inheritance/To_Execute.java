package Inheritance;
public class To_Execute {
    public static void main(String[] args) {
        Car car = new Car("V6", "Alloy", 5, "Toyota", 2022);
        System.out.println("Car Details:");
        car.displayCarInfo();

        System.out.println();

        Truck truck = new Truck("Diesel", "Heavy-Duty", 2, "Volvo FH", "Red");
        System.out.println("Truck Details:");
        truck.displayTruckInfo();
//        Vehicle v= new Car();// error i.e cannot call child class using parent
    }
}

