package Abstarction;

public abstract class Animal {

    abstract void sound();

   abstract void movement();

   void eat(){
       System.out.println("Animal is Eating...");
   }
}
abstract class Dog extends Animal {
    void sound(){
        System.out.println("Dog is barking.");
    }

}

class Puppy extends Dog {
    void movement() {
        System.out.println("Puppy is walking.");
    }
}
class Main{
    public static void main(String[] args) {
    Animal dog = new Puppy();
    dog.movement();
    dog.eat();
    dog.sound();
    }
}