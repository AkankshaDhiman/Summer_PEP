class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
public class exception_handling{
    void m(){ // 1 usage
        System.out.println("hello");
//        try {
            a();
//        }catch(Exception e){
//            System.out.println(e);
//        }
    }
    void a() { // 1 usage
        System.out.println("world");
        try {
            //System.out.println(10 / 0);
            int i=10/10;
            if(i==1)throw new MyException("My custom Exception");

        } catch (Exception e) {
            System.out.println("exception handled");
//             System.out.println(e.getMessage());
//             System.out.println(e.getCause());
//             System.out.println(e.toString());
//             System.out.println(e.getStackTrace());
        } finally {
            System.out.println("inside finally block");
            b();
        }
    }
    void b(){ // 2 usages
        System.out.println("executed");
    }
    public static void main(String[] args){
        exception_handling obj = new exception_handling();
        obj.b();
//        try {
          obj.m();
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }
    }
}
