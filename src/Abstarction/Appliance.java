package Abstarction;

/*

Interfaces are used to achieve 100% abstraction
   normal interface- 2 or more methods
   functional interface --one method
   marker interface -- no method(used to mark a class)
        ||
         => Serializable Interface----state of an object to bytestream;
    */

public abstract class Appliance {
    String brand;
    String Pusage;

    public Appliance(String brand, String Pusage) {
        this.brand = brand;
        this.Pusage = Pusage;
    }

    abstract double calculateBill(double powerInWatts, double hours);

}

class Fan extends Appliance {
    public Fan(String brand, String usage) {
        super(brand, usage);
    }

    @Override
    double calculateBill(double powerInWatts, double hours) {
        return (powerInWatts/1000) * hours * 1.5;
    }
}

class AC extends Appliance {
    public AC(String brand, String usage) {
        super(brand, usage);
    }

    @Override
    double calculateBill(double powerInWatts, double hours) {
        return (powerInWatts/1000) * hours * 5 ;
    }
}

class Execute{
    public static void main(String[] args) {
        Appliance appliance1 = new Fan("Fan", "Pusage");
        System.out.println(appliance1.calculateBill(2.5, 1.5));
        Appliance appliance2 = new AC("AC", "Pusage");
        System.out.println(appliance2.calculateBill(2.5, 1.5));
    }
}
