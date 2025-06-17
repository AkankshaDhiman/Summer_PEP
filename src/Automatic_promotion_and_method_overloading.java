public class Automatic_promotion_and_method_overloading {
    // byte-->short/char-->int-->long-->float-->double
    private String name;
    void m() {
        System.out.println("No args method");
    }

    void m(int a) {
        System.out.println("Int args method");
        System.out.println(a);
    }
    void m(Object o){
        System.out.println("Object args method");
    }

        void m(String s){
            System.out.println("successful");
        }
//        void m (StringBuffer sb){
//        System.out.println("successfully sb invoked");
//        }  //getting ambigous unexceptional call due to string and stringbuffer(compiler gets confused)

//
        void m(int a, int b, int c){
        System.out.println(" a,b,c successful");
        }

        void m(int a, float b){
        System.out.println("float args method");
        }

    public static void main(String[] args) {
        Automatic_promotion_and_method_overloading obj = new Automatic_promotion_and_method_overloading();
        obj.m();
        obj.m( 10);
        obj.m('c');

        String s= new String("Hello");
        Object o= new Object();
        obj.m(s);
        obj.m(o);
        obj.m(1.00);// error because double/float consumes more memory
        obj.m(null); //for strings and object
        //child class gets preference over parent class during function call in method overloading

        obj.m(10,15,7);
        obj.m(10,10);
        //obj.m(10.5f,10); //doesnot work


    }
}

