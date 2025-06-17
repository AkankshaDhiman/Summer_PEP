package Person;
public class Student extends Person {
    String qualification;
    int id;
    String college;

    public Student() {
        super();
        System.out.println("Student Constructor called");
    }
    public Student(String qualification, int id, String college) {
        super("John",25,"American");
        this.qualification = qualification;
        this.id = id;
        this.college = college;
        System.out.println();
        System.out.println("Student details");
        System.out.println("qualification: " + qualification);
        System.out.println("id: " + id);
        System.out.println("college: " + college);
    }


    public static void main(String[] args) {
        Student s1=new Student();
        Student s = new Student("Software Engineer",121,"LPU");

    }
}
