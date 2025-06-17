package Access_Modifiers_and_Constructors;

public class Person {
    String name;
    int age;
    String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        System.out.println();
        System.out.println("person details");
        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);
        System.out.println("Person nationality: " + nationality);
    }
    public Person() {
        System.out.println("Person constructor called");
    }
}
