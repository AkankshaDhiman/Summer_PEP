import java.util.Scanner;
import java.util.StringTokenizer;

public class day2_code1_avg_length_of_words {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String[] words = s.split(" ");
       int totalLen = 0;
       int Count = words.length;
        for (String word : words) {
            totalLen += word.length();
        }
//        StringTokenizer st = new StringTokenizer(s);
//        int totalLength = 0, count = 0;
//        while (st.hasMoreTokens()) {
//            String word = st.nextToken();
//            totalLength += word.length();
//            count++;
//        }
        double avg = (double)totalLen / Count;
        System.out.println(avg);
    }
}
