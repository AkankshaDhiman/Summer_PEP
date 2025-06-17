import java.util.Scanner;
import java.util.StringTokenizer;

public class day2_code1_avg_length_of_words {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        int totalLen = 0, count = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            totalLen += word.length();
            count++;
        }
        double avg = (double)totalLen / count;
        System.out.println(avg);
    }
}
