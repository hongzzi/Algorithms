import java.io.*;
import java.util.StringTokenizer;

public class Ed1924 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] date = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mon = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        String answer;
        int sumday = 0;

        if(mon==1) {
            answer = date[day%7];
        } else {
            for (int i = 1; i<mon; i++) {
                sumday +=days[i];
            }
            sumday += day;
            answer = date[sumday%7];
        }

        bw.write(answer);
        bw.flush();
        bw.close();
    }

}
