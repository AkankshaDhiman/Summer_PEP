public class Automatic_promotion {
    // byte/short/char-->int-->long-->float-->double
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

//    void m(String s){
//        System.out.println("successful");
//    }

    public static void main(String[] args) {
        Automatic_promotion obj = new Automatic_promotion();
        obj.m();
        obj.m( 10);
        obj.m('c');

       // obj.m(1.00)// error because double/float consumes more memory
        obj.m(null); //for strings and object
    }
}

