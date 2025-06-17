import java.util.StringTokenizer;

public class day1_code3_StringTokenizer_and_StringBuffer {
    public static void main(String[] args) {
//            String s1= new String("Monday");
//            StringBuffer s2=new StringBuffer("Monday");
//            StringBuffer s3= new StringBuffer("Monday");
//            StringBuilder s4= new StringBuilder("Monday");
//            StringBuilder s5= new StringBuilder("Monday");
//            String s6= new String("Monday");
//
//            System.out.println(s1.equals(s2));
//            System.out.println(s2==s3);
//            System.out.println(s2.equals(3));
//            System.out.println(s1.equals(s3));
//            System.out.println(s2==s3);
//            System.out.println(s2.equals(s3));
//            System.out.println(s4==s5);
//            System.out.println(s4.equals(s5));
//            System.out.println(s1.equals(s6));

        String s= new String("this is a java class");
//        String[] starr= s.split(" ");
//        System.out.println(starr[0]);
//        for(String st:starr){
//            System.out.println(st);
//        }
//        int firstSpaceIndex = s.indexOf(' ');
//        if (firstSpaceIndex != -1) {
//            System.out.println(s.substring(0, firstSpaceIndex));
//        } else {
//            System.out.println(s);
//        }

        StringTokenizer st= new StringTokenizer(s," ");
        while (st.countTokens()>0){
            System.out.println(st.nextToken());
        }
        System.out.println(st.hasMoreElements());
    }
}
