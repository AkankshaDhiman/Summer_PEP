package Access_Modifiers_and_Constructors;

public class Student extends Person {
    String qualification;
    int id;
    String college;
    Address address;

    public Student() {
        super();
        System.out.println("Student default constructor called");
    }

    public Student(String qualification, int id, String college) {
        super("John", 25, "American"); // hardcoded for example
        this.qualification = qualification;
        this.id = id;
        this.college = college;
        this.address = new Address("Phagwara"); // provide default or passed city

        System.out.println();
        System.out.println("Student details");
        System.out.println("Qualification: " + qualification);
        System.out.println("ID: " + id);
        System.out.println("College: " + college);
        System.out.println("Address city: " + address.city);
    }

    // Copy Constructor
    public Student(Student s) {
        super(s.name, s.age, s.nationality); // copy Person properties
        this.qualification = s.qualification;
        this.id = s.id;
        this.college = s.college;
        this.address = new Address(s.address.city); // deep copy

//        this.name = s.name;
//        this.age = s.age;
//        this.nationality = s.nationality;
//        this.qualification = s.qualification;
//        this.id = s.id;
//        this.college = s.college;
//        this.address = s.address; // reference copied (shallow)
    }

    public static void main(String[] args) {
        Student s = new Student("Software Engineer", 121, "LPU");
        Student st = new Student(s); // Copy constructor

        System.out.println();
        System.out.println("Before update:");
        System.out.println("st_name = " + st.name);
        System.out.println("s_name = " + s.name);

        st.name = "Akshi";

        System.out.println();
        System.out.println("After update:");
        System.out.println("st_name = " + st.name);
        System.out.println("s_name = " + s.name);
    }
}

// Inner class or separate file if preferred
class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}
