public class day1_code3 {
    public static void main(String[] args) {
        String s1= new String("Monday");
        StringBuffer s2=new StringBuffer("Monday");
        StringBuffer s3= new StringBuffer("Monday");
        StringBuilder s4= new StringBuilder("Monday");
        StringBuilder s5= new StringBuilder("Monday");
        String s6= new String("Monday");

        System.out.println(s1.equals(s2));
        System.out.println(s2==s3);
        System.out.println(s2.equals(3));
        System.out.println(s1.equals(s3));
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
        System.out.println(s1.equals(s6));
    }
}
