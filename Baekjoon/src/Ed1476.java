import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ed1476 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int earth = Integer.parseInt(st.nextToken());   //1<=e<=15
        int sun = Integer.parseInt(st.nextToken());     //1<=s<=28
        int moon = Integer.parseInt(st.nextToken());    //1<=m<=19

        int year = 1;

        while (true) {
            if(year%15==earth && year%28==sun && year%19==moon){
                bw.write(String.valueOf(year));
                break;
            }
            year++;
        }

        bw.flush();
        bw.close();

    }
}
